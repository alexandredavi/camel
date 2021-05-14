/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class NettyHttpConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public NettyHttpConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
        registerFallbackConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, byte[].class, io.netty.handler.codec.http.FullHttpResponse.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.toBytes((io.netty.handler.codec.http.FullHttpResponse) value, exchange));
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, org.apache.camel.component.netty.http.NettyChannelBufferStreamCache.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.toByteBuf((org.apache.camel.component.netty.http.NettyChannelBufferStreamCache) value, exchange));
        addTypeConverter(registry, java.io.InputStream.class, io.netty.handler.codec.http.FullHttpResponse.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.toInputStream((io.netty.handler.codec.http.FullHttpResponse) value, exchange));
        addTypeConverter(registry, java.lang.String.class, io.netty.handler.codec.http.FullHttpResponse.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.toString((io.netty.handler.codec.http.FullHttpResponse) value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

    private void registerFallbackConverters(TypeConverterRegistry registry) {
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.convertToHttpRequest(type, exchange, value, registry));
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> org.apache.camel.component.netty.http.NettyHttpConverter.convertToHttpResponse(type, exchange, value, registry));
    }

    private static void addFallbackTypeConverter(TypeConverterRegistry registry, boolean allowNull, boolean canPromote, SimpleTypeConverter.ConversionMethod method) { 
        registry.addFallbackTypeConverter(new SimpleTypeConverter(allowNull, method), canPromote);
    }

}
