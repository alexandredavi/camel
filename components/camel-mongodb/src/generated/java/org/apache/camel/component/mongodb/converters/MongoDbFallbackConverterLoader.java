/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb.converters;

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
public final class MongoDbFallbackConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public MongoDbFallbackConverterLoader() {
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
        registerFallbackConverters(registry);
    }

    private void registerFallbackConverters(TypeConverterRegistry registry) {
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> org.apache.camel.component.mongodb.converters.MongoDbFallbackConverter.convertTo(type, exchange, value, registry));
    }

    private static void addFallbackTypeConverter(TypeConverterRegistry registry, boolean allowNull, boolean canPromote, SimpleTypeConverter.ConversionMethod method) { 
        registry.addFallbackTypeConverter(new SimpleTypeConverter(allowNull, method), canPromote);
    }

}
