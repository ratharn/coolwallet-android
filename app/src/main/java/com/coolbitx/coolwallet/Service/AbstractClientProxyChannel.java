package com.coolbitx.coolwallet.Service;

import org.java_websocket.AbstractWrappedByteChannel;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/**
 * Created by ShihYi on 2016/4/13.
 */
public abstract class AbstractClientProxyChannel extends AbstractWrappedByteChannel {
    protected final ByteBuffer proxyHandshake;

    /**
     * @param towrap
     *            The channel to the proxy server
     **/
    public AbstractClientProxyChannel( ByteChannel towrap ) {
        super( towrap );
        try {
            proxyHandshake = ByteBuffer.wrap( buildHandShake().getBytes( "ASCII" ) );
        } catch ( UnsupportedEncodingException e ) {
            throw new RuntimeException( e );
        }
    }

    @Override
    public int write( ByteBuffer src ) throws IOException {
        if( !proxyHandshake.hasRemaining() ) {
            return super.write( src );
        } else {
            return super.write( proxyHandshake );
        }
    }

    public abstract String buildHandShake();

}
