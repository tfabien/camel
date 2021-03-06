/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.debezium.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Represents a Debezium SQL Server endpoint which is used to capture changes in
 * SQL Server database so that that applications can see those changes and
 * respond to them.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.debezium-sqlserver")
public class DebeziumSqlserverComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the debezium-sqlserver component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Allow pre-configured Configurations to be set.
     */
    private SqlServerConnectorEmbeddedDebeziumConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public SqlServerConnectorEmbeddedDebeziumConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SqlServerConnectorEmbeddedDebeziumConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class SqlServerConnectorEmbeddedDebeziumConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class;
        /**
         * A semicolon-separated list of expressions that match fully-qualified
         * tables and column(s) to be used as message key. Each expression must
         * match the pattern '<fully-qualified table name>:<key columns>',where
         * the table names could be defined as (DB_NAME.TABLE_NAME) or
         * (SCHEMA_NAME.TABLE_NAME), depending on the specific connector,and the
         * key columns are a comma-separated list of columns representing the
         * custom key. For any table without an explicit key configuration the
         * table's primary key column(s) will be used as message key.Example:
         * dbserver1.inventory.orderlines:orderId,orderLineId;dbserver1.inventory.orders:id
         */
        private String messageKeyColumns;
        /**
         * Maximum size of the queue for change events read from the database
         * log but not yet recorded or forwarded. Defaults to 8192, and should
         * always be larger than the maximum batch size.
         */
        private Integer maxQueueSize = 8192;
        /**
         * The name of the topic for the database schema history
         */
        private String databaseHistoryKafkaTopic;
        /**
         * Description is not available here, please check Debezium website for
         * corresponding key 'column.blacklist' description.
         */
        private String columnBlacklist;
        /**
         * The number of milliseconds to delay before a snapshot will begin.
         */
        private Long snapshotDelayMs = 0L;
        /**
         * The number of attempts in a row that no data are returned from Kafka
         * before recover completes. The maximum amount of time to wait after
         * receiving no data is (recovery.attempts) x
         * (recovery.poll.interval.ms).
         */
        private Integer databaseHistoryKafkaRecoveryAttempts = 100;
        /**
         * Description is not available here, please check Debezium website for
         * corresponding key 'table.blacklist' description.
         */
        private String tableBlacklist;
        /**
         * The tables for which changes are to be captured
         */
        private String tableWhitelist;
        /**
         * Specify how DECIMAL and NUMERIC columns should be represented in
         * change events, including:'precise' (the default) uses
         * java.math.BigDecimal to represent values, which are encoded in the
         * change events using a binary representation and Kafka Connect's
         * 'org.apache.kafka.connect.data.Decimal' type; 'string' uses string to
         * represent values; 'double' represents values using Java's 'double',
         * which may not offer the precision but will be far easier to use in
         * consumers.
         */
        private String decimalHandlingMode = "precise";
        /**
         * The number of milliseconds to wait while polling for persisted data
         * during recovery.
         */
        private Integer databaseHistoryKafkaRecoveryPollIntervalMs = 100;
        /**
         * Frequency in milliseconds to wait for new change events to appear
         * after receiving no events. Defaults to 500ms.
         */
        private Long pollIntervalMs = 500L;
        /**
         * The prefix that is used to name heartbeat topics.Defaults to
         * __debezium-heartbeat.
         */
        private String heartbeatTopicsPrefix = "__debezium-heartbeat";
        /**
         * Flag specifying whether built-in tables should be ignored.
         */
        private Boolean tableIgnoreBuiltin = true;
        /**
         * The maximum number of records that should be loaded into memory while
         * performing a snapshot
         */
        private Integer snapshotFetchSize;
        /**
         * The maximum number of millis to wait for table locks at the beginning
         * of a snapshot. If locks cannot be acquired in this time frame, the
         * snapshot will be aborted. Defaults to 10 seconds
         */
        private Long snapshotLockTimeoutMs = 10000L;
        /**
         * The path to the file that will be used to record the database history
         */
        private String databaseHistoryFileFilename;
        /**
         * The name of the database the connector should be monitoring. When
         * working with a multi-tenant set-up, must be set to the CDB name.
         */
        private String databaseDbname;
        /**
         * Name of the SQL Server database user to be used when connecting to
         * the database.
         */
        private String databaseUser;
        /**
         * This property contains a comma-separated list of fully-qualified
         * tables (DB_NAME.TABLE_NAME) or (SCHEMA_NAME.TABLE_NAME), depending on
         * thespecific connectors . Select statements for the individual tables
         * are specified in further configuration properties, one for each
         * table, identified by the id
         * 'snapshot.select.statement.overrides.[DB_NAME].[TABLE_NAME]' or
         * 'snapshot.select.statement.overrides.[SCHEMA_NAME].[TABLE_NAME]',
         * respectively. The value of those properties is the select statement
         * to use when retrieving data from the specific table during
         * snapshotting. A possible use case for large append-only tables is
         * setting a specific point where to start (resume) snapshotting, in
         * case a previous snapshotting was interrupted.
         */
        private String snapshotSelectStatementOverrides;
        /**
         * A list of host/port pairs that the connector will use for
         * establishing the initial connection to the Kafka cluster for
         * retrieving database schema history previously stored by the
         * connector. This should point to the same Kafka cluster used by the
         * Kafka Connect process.
         */
        private String databaseHistoryKafkaBootstrapServers;
        /**
         * Time, date, and timestamps can be represented with different kinds of
         * precisions, including:'adaptive' (the default) bases the precision of
         * time, date, and timestamp values on the database column's precision;
         * 'adaptive_time_microseconds' like 'adaptive' mode, but TIME fields
         * always use microseconds precision;'connect' always represents time,
         * date, and timestamp values using Kafka Connect's built-in
         * representations for Time, Date, and Timestamp, which uses millisecond
         * precision regardless of the database columns' precision .
         */
        private String timePrecisionMode = "adaptive";
        /**
         * Unique name that identifies the database server and all recorded
         * offsets, and that is used as a prefix for all schemas and topics.
         * Each distinct installation should have a separate namespace and be
         * monitored by at most one Debezium connector.
         */
        private String databaseServerName;
        /**
         * Length of an interval in milli-seconds in in which the connector
         * periodically sends heartbeat messages to a heartbeat topic. Use 0 to
         * disable heartbeat messages. Disabled by default.
         */
        private Integer heartbeatIntervalMs = 0;
        /**
         * A version of the format of the publicly visible source part in the
         * message
         */
        private String sourceStructVersion = "v2";
        /**
         * Port of the SQL Server database server.
         */
        private Integer databasePort = 1433;
        /**
         * Resolvable hostname or IP address of the SQL Server database server.
         */
        private String databaseHostname;
        /**
         * Password of the SQL Server database user to be used when connecting
         * to the database.
         */
        private String databasePassword;
        /**
         * Maximum size of each batch of source records. Defaults to 2048.
         */
        private Integer maxBatchSize = 2048;
        /**
         * The criteria for running a snapshot upon startup of the connector.
         * Options include: 'initial' (the default) to specify the connector
         * should run a snapshot only when no offsets are available for the
         * logical server name; 'initial_schema_only' to specify the connector
         * should run a snapshot of the schema when no offsets are available for
         * the logical server name.
         */
        private String snapshotMode = "initial";
        /**
         * The name of the DatabaseHistory class that should be used to store
         * and recover database schema changes. The configuration properties for
         * the history are prefixed with the 'database.history.' string.
         */
        private String databaseHistory = "io.debezium.relational.history.FileDatabaseHistory";
        /**
         * The name of the Java class for the connector
         */
        private Class connectorClass;
        /**
         * Unique name for the connector. Attempting to register again with the
         * same name will fail.
         */
        private String name;
        /**
         * The name of the Java class that is responsible for persistence of
         * connector offsets.
         */
        private String offsetStorage = "org.apache.kafka.connect.storage.FileOffsetBackingStore";
        /**
         * Path to file where offsets are to be stored. Required when
         * offset.storage is set to the FileOffsetBackingStore
         */
        private String offsetStorageFileName;
        /**
         * The name of the Kafka topic where offsets are to be stored. Required
         * when offset.storage is set to the KafkaOffsetBackingStore.
         */
        private String offsetStorageTopic;
        /**
         * Replication factor used when creating the offset storage topic.
         * Required when offset.storage is set to the KafkaOffsetBackingStore
         */
        private Integer offsetStorageReplicationFactor;
        /**
         * The name of the Java class of the commit policy. It defines when
         * offsets commit has to be triggered based on the number of events
         * processed and the time elapsed since the last commit. This class must
         * implement the interface 'OffsetCommitPolicy'. The default is a
         * periodic commit policy based upon time intervals.
         */
        private String offsetCommitPolicy = "io.debezium.embedded.spi.OffsetCommitPolicy.PeriodicCommitOffsetPolicy";
        /**
         * Interval at which to try committing offsets. The default is 1 minute.
         */
        private Long offsetFlushIntervalMs = 60000L;
        /**
         * Maximum number of milliseconds to wait for records to flush and
         * partition offset data to be committed to offset storage before
         * cancelling the process and restoring the offset data to be committed
         * in a future attempt. The default is 5 seconds.
         */
        private Long offsetCommitTimeoutMs = 5000L;
        /**
         * The number of partitions used when creating the offset storage topic.
         * Required when offset.storage is set to the 'KafkaOffsetBackingStore'.
         */
        private Integer offsetStoragePartitions;
        /**
         * The Converter class that should be used to serialize and deserialize
         * key data for offsets. The default is JSON converter.
         */
        private String internalKeyConverter = "org.apache.kafka.connect.json.JsonConverter";
        /**
         * The Converter class that should be used to serialize and deserialize
         * value data for offsets. The default is JSON converter.
         */
        private String internalValueConverter = "org.apache.kafka.connect.json.JsonConverter";

        public String getMessageKeyColumns() {
            return messageKeyColumns;
        }

        public void setMessageKeyColumns(String messageKeyColumns) {
            this.messageKeyColumns = messageKeyColumns;
        }

        public Integer getMaxQueueSize() {
            return maxQueueSize;
        }

        public void setMaxQueueSize(Integer maxQueueSize) {
            this.maxQueueSize = maxQueueSize;
        }

        public String getDatabaseHistoryKafkaTopic() {
            return databaseHistoryKafkaTopic;
        }

        public void setDatabaseHistoryKafkaTopic(
                String databaseHistoryKafkaTopic) {
            this.databaseHistoryKafkaTopic = databaseHistoryKafkaTopic;
        }

        public String getColumnBlacklist() {
            return columnBlacklist;
        }

        public void setColumnBlacklist(String columnBlacklist) {
            this.columnBlacklist = columnBlacklist;
        }

        public Long getSnapshotDelayMs() {
            return snapshotDelayMs;
        }

        public void setSnapshotDelayMs(Long snapshotDelayMs) {
            this.snapshotDelayMs = snapshotDelayMs;
        }

        public Integer getDatabaseHistoryKafkaRecoveryAttempts() {
            return databaseHistoryKafkaRecoveryAttempts;
        }

        public void setDatabaseHistoryKafkaRecoveryAttempts(
                Integer databaseHistoryKafkaRecoveryAttempts) {
            this.databaseHistoryKafkaRecoveryAttempts = databaseHistoryKafkaRecoveryAttempts;
        }

        public String getTableBlacklist() {
            return tableBlacklist;
        }

        public void setTableBlacklist(String tableBlacklist) {
            this.tableBlacklist = tableBlacklist;
        }

        public String getTableWhitelist() {
            return tableWhitelist;
        }

        public void setTableWhitelist(String tableWhitelist) {
            this.tableWhitelist = tableWhitelist;
        }

        public String getDecimalHandlingMode() {
            return decimalHandlingMode;
        }

        public void setDecimalHandlingMode(String decimalHandlingMode) {
            this.decimalHandlingMode = decimalHandlingMode;
        }

        public Integer getDatabaseHistoryKafkaRecoveryPollIntervalMs() {
            return databaseHistoryKafkaRecoveryPollIntervalMs;
        }

        public void setDatabaseHistoryKafkaRecoveryPollIntervalMs(
                Integer databaseHistoryKafkaRecoveryPollIntervalMs) {
            this.databaseHistoryKafkaRecoveryPollIntervalMs = databaseHistoryKafkaRecoveryPollIntervalMs;
        }

        public Long getPollIntervalMs() {
            return pollIntervalMs;
        }

        public void setPollIntervalMs(Long pollIntervalMs) {
            this.pollIntervalMs = pollIntervalMs;
        }

        public String getHeartbeatTopicsPrefix() {
            return heartbeatTopicsPrefix;
        }

        public void setHeartbeatTopicsPrefix(String heartbeatTopicsPrefix) {
            this.heartbeatTopicsPrefix = heartbeatTopicsPrefix;
        }

        public Boolean getTableIgnoreBuiltin() {
            return tableIgnoreBuiltin;
        }

        public void setTableIgnoreBuiltin(Boolean tableIgnoreBuiltin) {
            this.tableIgnoreBuiltin = tableIgnoreBuiltin;
        }

        public Integer getSnapshotFetchSize() {
            return snapshotFetchSize;
        }

        public void setSnapshotFetchSize(Integer snapshotFetchSize) {
            this.snapshotFetchSize = snapshotFetchSize;
        }

        public Long getSnapshotLockTimeoutMs() {
            return snapshotLockTimeoutMs;
        }

        public void setSnapshotLockTimeoutMs(Long snapshotLockTimeoutMs) {
            this.snapshotLockTimeoutMs = snapshotLockTimeoutMs;
        }

        public String getDatabaseHistoryFileFilename() {
            return databaseHistoryFileFilename;
        }

        public void setDatabaseHistoryFileFilename(
                String databaseHistoryFileFilename) {
            this.databaseHistoryFileFilename = databaseHistoryFileFilename;
        }

        public String getDatabaseDbname() {
            return databaseDbname;
        }

        public void setDatabaseDbname(String databaseDbname) {
            this.databaseDbname = databaseDbname;
        }

        public String getDatabaseUser() {
            return databaseUser;
        }

        public void setDatabaseUser(String databaseUser) {
            this.databaseUser = databaseUser;
        }

        public String getSnapshotSelectStatementOverrides() {
            return snapshotSelectStatementOverrides;
        }

        public void setSnapshotSelectStatementOverrides(
                String snapshotSelectStatementOverrides) {
            this.snapshotSelectStatementOverrides = snapshotSelectStatementOverrides;
        }

        public String getDatabaseHistoryKafkaBootstrapServers() {
            return databaseHistoryKafkaBootstrapServers;
        }

        public void setDatabaseHistoryKafkaBootstrapServers(
                String databaseHistoryKafkaBootstrapServers) {
            this.databaseHistoryKafkaBootstrapServers = databaseHistoryKafkaBootstrapServers;
        }

        public String getTimePrecisionMode() {
            return timePrecisionMode;
        }

        public void setTimePrecisionMode(String timePrecisionMode) {
            this.timePrecisionMode = timePrecisionMode;
        }

        public String getDatabaseServerName() {
            return databaseServerName;
        }

        public void setDatabaseServerName(String databaseServerName) {
            this.databaseServerName = databaseServerName;
        }

        public Integer getHeartbeatIntervalMs() {
            return heartbeatIntervalMs;
        }

        public void setHeartbeatIntervalMs(Integer heartbeatIntervalMs) {
            this.heartbeatIntervalMs = heartbeatIntervalMs;
        }

        public String getSourceStructVersion() {
            return sourceStructVersion;
        }

        public void setSourceStructVersion(String sourceStructVersion) {
            this.sourceStructVersion = sourceStructVersion;
        }

        public Integer getDatabasePort() {
            return databasePort;
        }

        public void setDatabasePort(Integer databasePort) {
            this.databasePort = databasePort;
        }

        public String getDatabaseHostname() {
            return databaseHostname;
        }

        public void setDatabaseHostname(String databaseHostname) {
            this.databaseHostname = databaseHostname;
        }

        public String getDatabasePassword() {
            return databasePassword;
        }

        public void setDatabasePassword(String databasePassword) {
            this.databasePassword = databasePassword;
        }

        public Integer getMaxBatchSize() {
            return maxBatchSize;
        }

        public void setMaxBatchSize(Integer maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
        }

        public String getSnapshotMode() {
            return snapshotMode;
        }

        public void setSnapshotMode(String snapshotMode) {
            this.snapshotMode = snapshotMode;
        }

        public String getDatabaseHistory() {
            return databaseHistory;
        }

        public void setDatabaseHistory(String databaseHistory) {
            this.databaseHistory = databaseHistory;
        }

        public Class getConnectorClass() {
            return connectorClass;
        }

        public void setConnectorClass(Class connectorClass) {
            this.connectorClass = connectorClass;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOffsetStorage() {
            return offsetStorage;
        }

        public void setOffsetStorage(String offsetStorage) {
            this.offsetStorage = offsetStorage;
        }

        public String getOffsetStorageFileName() {
            return offsetStorageFileName;
        }

        public void setOffsetStorageFileName(String offsetStorageFileName) {
            this.offsetStorageFileName = offsetStorageFileName;
        }

        public String getOffsetStorageTopic() {
            return offsetStorageTopic;
        }

        public void setOffsetStorageTopic(String offsetStorageTopic) {
            this.offsetStorageTopic = offsetStorageTopic;
        }

        public Integer getOffsetStorageReplicationFactor() {
            return offsetStorageReplicationFactor;
        }

        public void setOffsetStorageReplicationFactor(
                Integer offsetStorageReplicationFactor) {
            this.offsetStorageReplicationFactor = offsetStorageReplicationFactor;
        }

        public String getOffsetCommitPolicy() {
            return offsetCommitPolicy;
        }

        public void setOffsetCommitPolicy(String offsetCommitPolicy) {
            this.offsetCommitPolicy = offsetCommitPolicy;
        }

        public Long getOffsetFlushIntervalMs() {
            return offsetFlushIntervalMs;
        }

        public void setOffsetFlushIntervalMs(Long offsetFlushIntervalMs) {
            this.offsetFlushIntervalMs = offsetFlushIntervalMs;
        }

        public Long getOffsetCommitTimeoutMs() {
            return offsetCommitTimeoutMs;
        }

        public void setOffsetCommitTimeoutMs(Long offsetCommitTimeoutMs) {
            this.offsetCommitTimeoutMs = offsetCommitTimeoutMs;
        }

        public Integer getOffsetStoragePartitions() {
            return offsetStoragePartitions;
        }

        public void setOffsetStoragePartitions(Integer offsetStoragePartitions) {
            this.offsetStoragePartitions = offsetStoragePartitions;
        }

        public String getInternalKeyConverter() {
            return internalKeyConverter;
        }

        public void setInternalKeyConverter(String internalKeyConverter) {
            this.internalKeyConverter = internalKeyConverter;
        }

        public String getInternalValueConverter() {
            return internalValueConverter;
        }

        public void setInternalValueConverter(String internalValueConverter) {
            this.internalValueConverter = internalValueConverter;
        }
    }
}