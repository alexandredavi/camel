/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.eventhubs;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EventHubsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EventHubsEndpoint target = (EventHubsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": target.getConfiguration().setAmqpRetryOptions(property(camelContext, com.azure.core.amqp.AmqpRetryOptions.class, value)); return true;
        case "amqptransporttype":
        case "amqpTransportType": target.getConfiguration().setAmqpTransportType(property(camelContext, com.azure.core.amqp.AmqpTransportType.class, value)); return true;
        case "blobaccesskey":
        case "blobAccessKey": target.getConfiguration().setBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "blobaccountname":
        case "blobAccountName": target.getConfiguration().setBlobAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobcontainername":
        case "blobContainerName": target.getConfiguration().setBlobContainerName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": target.getConfiguration().setBlobStorageSharedKeyCredential(property(camelContext, com.azure.storage.common.StorageSharedKeyCredential.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "checkpointbatchsize":
        case "checkpointBatchSize": target.getConfiguration().setCheckpointBatchSize(property(camelContext, int.class, value)); return true;
        case "checkpointbatchtimeout":
        case "checkpointBatchTimeout": target.getConfiguration().setCheckpointBatchTimeout(property(camelContext, int.class, value)); return true;
        case "checkpointstore":
        case "checkpointStore": target.getConfiguration().setCheckpointStore(property(camelContext, com.azure.messaging.eventhubs.CheckpointStore.class, value)); return true;
        case "connectionstring":
        case "connectionString": target.getConfiguration().setConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "consumergroupname":
        case "consumerGroupName": target.getConfiguration().setConsumerGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventposition":
        case "eventPosition": target.getConfiguration().setEventPosition(property(camelContext, java.util.Map.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "partitionid":
        case "partitionId": target.getConfiguration().setPartitionId(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionkey":
        case "partitionKey": target.getConfiguration().setPartitionKey(property(camelContext, java.lang.String.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.getConfiguration().setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "producerasyncclient":
        case "producerAsyncClient": target.getConfiguration().setProducerAsyncClient(property(camelContext, com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class, value)); return true;
        case "sharedaccesskey":
        case "sharedAccessKey": target.getConfiguration().setSharedAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sharedaccessname":
        case "sharedAccessName": target.getConfiguration().setSharedAccessName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"producerAsyncClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return com.azure.core.amqp.AmqpRetryOptions.class;
        case "amqptransporttype":
        case "amqpTransportType": return com.azure.core.amqp.AmqpTransportType.class;
        case "blobaccesskey":
        case "blobAccessKey": return java.lang.String.class;
        case "blobaccountname":
        case "blobAccountName": return java.lang.String.class;
        case "blobcontainername":
        case "blobContainerName": return java.lang.String.class;
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": return com.azure.storage.common.StorageSharedKeyCredential.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "checkpointbatchsize":
        case "checkpointBatchSize": return int.class;
        case "checkpointbatchtimeout":
        case "checkpointBatchTimeout": return int.class;
        case "checkpointstore":
        case "checkpointStore": return com.azure.messaging.eventhubs.CheckpointStore.class;
        case "connectionstring":
        case "connectionString": return java.lang.String.class;
        case "consumergroupname":
        case "consumerGroupName": return java.lang.String.class;
        case "eventposition":
        case "eventPosition": return java.util.Map.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "partitionid":
        case "partitionId": return java.lang.String.class;
        case "partitionkey":
        case "partitionKey": return java.lang.String.class;
        case "prefetchcount":
        case "prefetchCount": return int.class;
        case "producerasyncclient":
        case "producerAsyncClient": return com.azure.messaging.eventhubs.EventHubProducerAsyncClient.class;
        case "sharedaccesskey":
        case "sharedAccessKey": return java.lang.String.class;
        case "sharedaccessname":
        case "sharedAccessName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        EventHubsEndpoint target = (EventHubsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return target.getConfiguration().getAmqpRetryOptions();
        case "amqptransporttype":
        case "amqpTransportType": return target.getConfiguration().getAmqpTransportType();
        case "blobaccesskey":
        case "blobAccessKey": return target.getConfiguration().getBlobAccessKey();
        case "blobaccountname":
        case "blobAccountName": return target.getConfiguration().getBlobAccountName();
        case "blobcontainername":
        case "blobContainerName": return target.getConfiguration().getBlobContainerName();
        case "blobstoragesharedkeycredential":
        case "blobStorageSharedKeyCredential": return target.getConfiguration().getBlobStorageSharedKeyCredential();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "checkpointbatchsize":
        case "checkpointBatchSize": return target.getConfiguration().getCheckpointBatchSize();
        case "checkpointbatchtimeout":
        case "checkpointBatchTimeout": return target.getConfiguration().getCheckpointBatchTimeout();
        case "checkpointstore":
        case "checkpointStore": return target.getConfiguration().getCheckpointStore();
        case "connectionstring":
        case "connectionString": return target.getConfiguration().getConnectionString();
        case "consumergroupname":
        case "consumerGroupName": return target.getConfiguration().getConsumerGroupName();
        case "eventposition":
        case "eventPosition": return target.getConfiguration().getEventPosition();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "partitionid":
        case "partitionId": return target.getConfiguration().getPartitionId();
        case "partitionkey":
        case "partitionKey": return target.getConfiguration().getPartitionKey();
        case "prefetchcount":
        case "prefetchCount": return target.getConfiguration().getPrefetchCount();
        case "producerasyncclient":
        case "producerAsyncClient": return target.getConfiguration().getProducerAsyncClient();
        case "sharedaccesskey":
        case "sharedAccessKey": return target.getConfiguration().getSharedAccessKey();
        case "sharedaccessname":
        case "sharedAccessName": return target.getConfiguration().getSharedAccessName();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "eventposition":
        case "eventPosition": return com.azure.messaging.eventhubs.models.EventPosition.class;
        default: return null;
        }
    }
}

