using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
    /// </summary>
    public sealed class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties:  IEquatable<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// GlobalSize
        /// </summary>
        public ConfigNodePropertyInteger GlobalSize { get; private set; }

        /// <summary>
        /// MaxDiskUsage
        /// </summary>
        public ConfigNodePropertyInteger MaxDiskUsage { get; private set; }

        /// <summary>
        /// PersistenceEnabled
        /// </summary>
        public ConfigNodePropertyBoolean PersistenceEnabled { get; private set; }

        /// <summary>
        /// ThreadPoolMaxSize
        /// </summary>
        public ConfigNodePropertyInteger ThreadPoolMaxSize { get; private set; }

        /// <summary>
        /// ScheduledThreadPoolMaxSize
        /// </summary>
        public ConfigNodePropertyInteger ScheduledThreadPoolMaxSize { get; private set; }

        /// <summary>
        /// GracefulShutdownTimeout
        /// </summary>
        public ConfigNodePropertyInteger GracefulShutdownTimeout { get; private set; }

        /// <summary>
        /// Queues
        /// </summary>
        public ConfigNodePropertyArray Queues { get; private set; }

        /// <summary>
        /// Topics
        /// </summary>
        public ConfigNodePropertyArray Topics { get; private set; }

        /// <summary>
        /// AddressesMaxDeliveryAttempts
        /// </summary>
        public ConfigNodePropertyInteger AddressesMaxDeliveryAttempts { get; private set; }

        /// <summary>
        /// AddressesExpiryDelay
        /// </summary>
        public ConfigNodePropertyInteger AddressesExpiryDelay { get; private set; }

        /// <summary>
        /// AddressesAddressFullMessagePolicy
        /// </summary>
        public ConfigNodePropertyDropDown AddressesAddressFullMessagePolicy { get; private set; }

        /// <summary>
        /// AddressesMaxSizeBytes
        /// </summary>
        public ConfigNodePropertyInteger AddressesMaxSizeBytes { get; private set; }

        /// <summary>
        /// AddressesPageSizeBytes
        /// </summary>
        public ConfigNodePropertyInteger AddressesPageSizeBytes { get; private set; }

        /// <summary>
        /// AddressesPageCacheMaxSize
        /// </summary>
        public ConfigNodePropertyInteger AddressesPageCacheMaxSize { get; private set; }

        /// <summary>
        /// ClusterUser
        /// </summary>
        public ConfigNodePropertyString ClusterUser { get; private set; }

        /// <summary>
        /// ClusterPassword
        /// </summary>
        public ConfigNodePropertyString ClusterPassword { get; private set; }

        /// <summary>
        /// ClusterCallTimeout
        /// </summary>
        public ConfigNodePropertyInteger ClusterCallTimeout { get; private set; }

        /// <summary>
        /// ClusterCallFailoverTimeout
        /// </summary>
        public ConfigNodePropertyInteger ClusterCallFailoverTimeout { get; private set; }

        /// <summary>
        /// ClusterClientFailureCheckPeriod
        /// </summary>
        public ConfigNodePropertyInteger ClusterClientFailureCheckPeriod { get; private set; }

        /// <summary>
        /// ClusterNotificationAttempts
        /// </summary>
        public ConfigNodePropertyInteger ClusterNotificationAttempts { get; private set; }

        /// <summary>
        /// ClusterNotificationInterval
        /// </summary>
        public ConfigNodePropertyInteger ClusterNotificationInterval { get; private set; }

        /// <summary>
        /// IdCacheSize
        /// </summary>
        public ConfigNodePropertyInteger IdCacheSize { get; private set; }

        /// <summary>
        /// ClusterConfirmationWindowSize
        /// </summary>
        public ConfigNodePropertyInteger ClusterConfirmationWindowSize { get; private set; }

        /// <summary>
        /// ClusterConnectionTtl
        /// </summary>
        public ConfigNodePropertyInteger ClusterConnectionTtl { get; private set; }

        /// <summary>
        /// ClusterDuplicateDetection
        /// </summary>
        public ConfigNodePropertyBoolean ClusterDuplicateDetection { get; private set; }

        /// <summary>
        /// ClusterInitialConnectAttempts
        /// </summary>
        public ConfigNodePropertyInteger ClusterInitialConnectAttempts { get; private set; }

        /// <summary>
        /// ClusterMaxRetryInterval
        /// </summary>
        public ConfigNodePropertyInteger ClusterMaxRetryInterval { get; private set; }

        /// <summary>
        /// ClusterMinLargeMessageSize
        /// </summary>
        public ConfigNodePropertyInteger ClusterMinLargeMessageSize { get; private set; }

        /// <summary>
        /// ClusterProducerWindowSize
        /// </summary>
        public ConfigNodePropertyInteger ClusterProducerWindowSize { get; private set; }

        /// <summary>
        /// ClusterReconnectAttempts
        /// </summary>
        public ConfigNodePropertyInteger ClusterReconnectAttempts { get; private set; }

        /// <summary>
        /// ClusterRetryInterval
        /// </summary>
        public ConfigNodePropertyInteger ClusterRetryInterval { get; private set; }

        /// <summary>
        /// ClusterRetryIntervalMultiplier
        /// </summary>
        public ConfigNodePropertyFloat ClusterRetryIntervalMultiplier { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties()
        {
        }

        private ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyInteger GlobalSize, ConfigNodePropertyInteger MaxDiskUsage, ConfigNodePropertyBoolean PersistenceEnabled, ConfigNodePropertyInteger ThreadPoolMaxSize, ConfigNodePropertyInteger ScheduledThreadPoolMaxSize, ConfigNodePropertyInteger GracefulShutdownTimeout, ConfigNodePropertyArray Queues, ConfigNodePropertyArray Topics, ConfigNodePropertyInteger AddressesMaxDeliveryAttempts, ConfigNodePropertyInteger AddressesExpiryDelay, ConfigNodePropertyDropDown AddressesAddressFullMessagePolicy, ConfigNodePropertyInteger AddressesMaxSizeBytes, ConfigNodePropertyInteger AddressesPageSizeBytes, ConfigNodePropertyInteger AddressesPageCacheMaxSize, ConfigNodePropertyString ClusterUser, ConfigNodePropertyString ClusterPassword, ConfigNodePropertyInteger ClusterCallTimeout, ConfigNodePropertyInteger ClusterCallFailoverTimeout, ConfigNodePropertyInteger ClusterClientFailureCheckPeriod, ConfigNodePropertyInteger ClusterNotificationAttempts, ConfigNodePropertyInteger ClusterNotificationInterval, ConfigNodePropertyInteger IdCacheSize, ConfigNodePropertyInteger ClusterConfirmationWindowSize, ConfigNodePropertyInteger ClusterConnectionTtl, ConfigNodePropertyBoolean ClusterDuplicateDetection, ConfigNodePropertyInteger ClusterInitialConnectAttempts, ConfigNodePropertyInteger ClusterMaxRetryInterval, ConfigNodePropertyInteger ClusterMinLargeMessageSize, ConfigNodePropertyInteger ClusterProducerWindowSize, ConfigNodePropertyInteger ClusterReconnectAttempts, ConfigNodePropertyInteger ClusterRetryInterval, ConfigNodePropertyFloat ClusterRetryIntervalMultiplier)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.GlobalSize = GlobalSize;
            
            this.MaxDiskUsage = MaxDiskUsage;
            
            this.PersistenceEnabled = PersistenceEnabled;
            
            this.ThreadPoolMaxSize = ThreadPoolMaxSize;
            
            this.ScheduledThreadPoolMaxSize = ScheduledThreadPoolMaxSize;
            
            this.GracefulShutdownTimeout = GracefulShutdownTimeout;
            
            this.Queues = Queues;
            
            this.Topics = Topics;
            
            this.AddressesMaxDeliveryAttempts = AddressesMaxDeliveryAttempts;
            
            this.AddressesExpiryDelay = AddressesExpiryDelay;
            
            this.AddressesAddressFullMessagePolicy = AddressesAddressFullMessagePolicy;
            
            this.AddressesMaxSizeBytes = AddressesMaxSizeBytes;
            
            this.AddressesPageSizeBytes = AddressesPageSizeBytes;
            
            this.AddressesPageCacheMaxSize = AddressesPageCacheMaxSize;
            
            this.ClusterUser = ClusterUser;
            
            this.ClusterPassword = ClusterPassword;
            
            this.ClusterCallTimeout = ClusterCallTimeout;
            
            this.ClusterCallFailoverTimeout = ClusterCallFailoverTimeout;
            
            this.ClusterClientFailureCheckPeriod = ClusterClientFailureCheckPeriod;
            
            this.ClusterNotificationAttempts = ClusterNotificationAttempts;
            
            this.ClusterNotificationInterval = ClusterNotificationInterval;
            
            this.IdCacheSize = IdCacheSize;
            
            this.ClusterConfirmationWindowSize = ClusterConfirmationWindowSize;
            
            this.ClusterConnectionTtl = ClusterConnectionTtl;
            
            this.ClusterDuplicateDetection = ClusterDuplicateDetection;
            
            this.ClusterInitialConnectAttempts = ClusterInitialConnectAttempts;
            
            this.ClusterMaxRetryInterval = ClusterMaxRetryInterval;
            
            this.ClusterMinLargeMessageSize = ClusterMinLargeMessageSize;
            
            this.ClusterProducerWindowSize = ClusterProducerWindowSize;
            
            this.ClusterReconnectAttempts = ClusterReconnectAttempts;
            
            this.ClusterRetryInterval = ClusterRetryInterval;
            
            this.ClusterRetryIntervalMultiplier = ClusterRetryIntervalMultiplier;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder</returns>
        public static ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder</returns>
        public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .GlobalSize(GlobalSize)
                .MaxDiskUsage(MaxDiskUsage)
                .PersistenceEnabled(PersistenceEnabled)
                .ThreadPoolMaxSize(ThreadPoolMaxSize)
                .ScheduledThreadPoolMaxSize(ScheduledThreadPoolMaxSize)
                .GracefulShutdownTimeout(GracefulShutdownTimeout)
                .Queues(Queues)
                .Topics(Topics)
                .AddressesMaxDeliveryAttempts(AddressesMaxDeliveryAttempts)
                .AddressesExpiryDelay(AddressesExpiryDelay)
                .AddressesAddressFullMessagePolicy(AddressesAddressFullMessagePolicy)
                .AddressesMaxSizeBytes(AddressesMaxSizeBytes)
                .AddressesPageSizeBytes(AddressesPageSizeBytes)
                .AddressesPageCacheMaxSize(AddressesPageCacheMaxSize)
                .ClusterUser(ClusterUser)
                .ClusterPassword(ClusterPassword)
                .ClusterCallTimeout(ClusterCallTimeout)
                .ClusterCallFailoverTimeout(ClusterCallFailoverTimeout)
                .ClusterClientFailureCheckPeriod(ClusterClientFailureCheckPeriod)
                .ClusterNotificationAttempts(ClusterNotificationAttempts)
                .ClusterNotificationInterval(ClusterNotificationInterval)
                .IdCacheSize(IdCacheSize)
                .ClusterConfirmationWindowSize(ClusterConfirmationWindowSize)
                .ClusterConnectionTtl(ClusterConnectionTtl)
                .ClusterDuplicateDetection(ClusterDuplicateDetection)
                .ClusterInitialConnectAttempts(ClusterInitialConnectAttempts)
                .ClusterMaxRetryInterval(ClusterMaxRetryInterval)
                .ClusterMinLargeMessageSize(ClusterMinLargeMessageSize)
                .ClusterProducerWindowSize(ClusterProducerWindowSize)
                .ClusterReconnectAttempts(ClusterReconnectAttempts)
                .ClusterRetryInterval(ClusterRetryInterval)
                .ClusterRetryIntervalMultiplier(ClusterRetryIntervalMultiplier);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties left, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties left, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyInteger _GlobalSize;
            private ConfigNodePropertyInteger _MaxDiskUsage;
            private ConfigNodePropertyBoolean _PersistenceEnabled;
            private ConfigNodePropertyInteger _ThreadPoolMaxSize;
            private ConfigNodePropertyInteger _ScheduledThreadPoolMaxSize;
            private ConfigNodePropertyInteger _GracefulShutdownTimeout;
            private ConfigNodePropertyArray _Queues;
            private ConfigNodePropertyArray _Topics;
            private ConfigNodePropertyInteger _AddressesMaxDeliveryAttempts;
            private ConfigNodePropertyInteger _AddressesExpiryDelay;
            private ConfigNodePropertyDropDown _AddressesAddressFullMessagePolicy;
            private ConfigNodePropertyInteger _AddressesMaxSizeBytes;
            private ConfigNodePropertyInteger _AddressesPageSizeBytes;
            private ConfigNodePropertyInteger _AddressesPageCacheMaxSize;
            private ConfigNodePropertyString _ClusterUser;
            private ConfigNodePropertyString _ClusterPassword;
            private ConfigNodePropertyInteger _ClusterCallTimeout;
            private ConfigNodePropertyInteger _ClusterCallFailoverTimeout;
            private ConfigNodePropertyInteger _ClusterClientFailureCheckPeriod;
            private ConfigNodePropertyInteger _ClusterNotificationAttempts;
            private ConfigNodePropertyInteger _ClusterNotificationInterval;
            private ConfigNodePropertyInteger _IdCacheSize;
            private ConfigNodePropertyInteger _ClusterConfirmationWindowSize;
            private ConfigNodePropertyInteger _ClusterConnectionTtl;
            private ConfigNodePropertyBoolean _ClusterDuplicateDetection;
            private ConfigNodePropertyInteger _ClusterInitialConnectAttempts;
            private ConfigNodePropertyInteger _ClusterMaxRetryInterval;
            private ConfigNodePropertyInteger _ClusterMinLargeMessageSize;
            private ConfigNodePropertyInteger _ClusterProducerWindowSize;
            private ConfigNodePropertyInteger _ClusterReconnectAttempts;
            private ConfigNodePropertyInteger _ClusterRetryInterval;
            private ConfigNodePropertyFloat _ClusterRetryIntervalMultiplier;

            internal ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.GlobalSize property.
            /// </summary>
            /// <param name="value">GlobalSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder GlobalSize(ConfigNodePropertyInteger value)
            {
                _GlobalSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.MaxDiskUsage property.
            /// </summary>
            /// <param name="value">MaxDiskUsage</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder MaxDiskUsage(ConfigNodePropertyInteger value)
            {
                _MaxDiskUsage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.PersistenceEnabled property.
            /// </summary>
            /// <param name="value">PersistenceEnabled</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder PersistenceEnabled(ConfigNodePropertyBoolean value)
            {
                _PersistenceEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ThreadPoolMaxSize property.
            /// </summary>
            /// <param name="value">ThreadPoolMaxSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ThreadPoolMaxSize(ConfigNodePropertyInteger value)
            {
                _ThreadPoolMaxSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ScheduledThreadPoolMaxSize property.
            /// </summary>
            /// <param name="value">ScheduledThreadPoolMaxSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ScheduledThreadPoolMaxSize(ConfigNodePropertyInteger value)
            {
                _ScheduledThreadPoolMaxSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.GracefulShutdownTimeout property.
            /// </summary>
            /// <param name="value">GracefulShutdownTimeout</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder GracefulShutdownTimeout(ConfigNodePropertyInteger value)
            {
                _GracefulShutdownTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.Queues property.
            /// </summary>
            /// <param name="value">Queues</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder Queues(ConfigNodePropertyArray value)
            {
                _Queues = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.Topics property.
            /// </summary>
            /// <param name="value">Topics</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder Topics(ConfigNodePropertyArray value)
            {
                _Topics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesMaxDeliveryAttempts property.
            /// </summary>
            /// <param name="value">AddressesMaxDeliveryAttempts</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesMaxDeliveryAttempts(ConfigNodePropertyInteger value)
            {
                _AddressesMaxDeliveryAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesExpiryDelay property.
            /// </summary>
            /// <param name="value">AddressesExpiryDelay</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesExpiryDelay(ConfigNodePropertyInteger value)
            {
                _AddressesExpiryDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesAddressFullMessagePolicy property.
            /// </summary>
            /// <param name="value">AddressesAddressFullMessagePolicy</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown value)
            {
                _AddressesAddressFullMessagePolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesMaxSizeBytes property.
            /// </summary>
            /// <param name="value">AddressesMaxSizeBytes</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesMaxSizeBytes(ConfigNodePropertyInteger value)
            {
                _AddressesMaxSizeBytes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesPageSizeBytes property.
            /// </summary>
            /// <param name="value">AddressesPageSizeBytes</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesPageSizeBytes(ConfigNodePropertyInteger value)
            {
                _AddressesPageSizeBytes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.AddressesPageCacheMaxSize property.
            /// </summary>
            /// <param name="value">AddressesPageCacheMaxSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder AddressesPageCacheMaxSize(ConfigNodePropertyInteger value)
            {
                _AddressesPageCacheMaxSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterUser property.
            /// </summary>
            /// <param name="value">ClusterUser</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterUser(ConfigNodePropertyString value)
            {
                _ClusterUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterPassword property.
            /// </summary>
            /// <param name="value">ClusterPassword</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterPassword(ConfigNodePropertyString value)
            {
                _ClusterPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterCallTimeout property.
            /// </summary>
            /// <param name="value">ClusterCallTimeout</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterCallTimeout(ConfigNodePropertyInteger value)
            {
                _ClusterCallTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterCallFailoverTimeout property.
            /// </summary>
            /// <param name="value">ClusterCallFailoverTimeout</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterCallFailoverTimeout(ConfigNodePropertyInteger value)
            {
                _ClusterCallFailoverTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterClientFailureCheckPeriod property.
            /// </summary>
            /// <param name="value">ClusterClientFailureCheckPeriod</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterClientFailureCheckPeriod(ConfigNodePropertyInteger value)
            {
                _ClusterClientFailureCheckPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterNotificationAttempts property.
            /// </summary>
            /// <param name="value">ClusterNotificationAttempts</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterNotificationAttempts(ConfigNodePropertyInteger value)
            {
                _ClusterNotificationAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterNotificationInterval property.
            /// </summary>
            /// <param name="value">ClusterNotificationInterval</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterNotificationInterval(ConfigNodePropertyInteger value)
            {
                _ClusterNotificationInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.IdCacheSize property.
            /// </summary>
            /// <param name="value">IdCacheSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder IdCacheSize(ConfigNodePropertyInteger value)
            {
                _IdCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterConfirmationWindowSize property.
            /// </summary>
            /// <param name="value">ClusterConfirmationWindowSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterConfirmationWindowSize(ConfigNodePropertyInteger value)
            {
                _ClusterConfirmationWindowSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterConnectionTtl property.
            /// </summary>
            /// <param name="value">ClusterConnectionTtl</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterConnectionTtl(ConfigNodePropertyInteger value)
            {
                _ClusterConnectionTtl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterDuplicateDetection property.
            /// </summary>
            /// <param name="value">ClusterDuplicateDetection</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterDuplicateDetection(ConfigNodePropertyBoolean value)
            {
                _ClusterDuplicateDetection = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterInitialConnectAttempts property.
            /// </summary>
            /// <param name="value">ClusterInitialConnectAttempts</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterInitialConnectAttempts(ConfigNodePropertyInteger value)
            {
                _ClusterInitialConnectAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterMaxRetryInterval property.
            /// </summary>
            /// <param name="value">ClusterMaxRetryInterval</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterMaxRetryInterval(ConfigNodePropertyInteger value)
            {
                _ClusterMaxRetryInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterMinLargeMessageSize property.
            /// </summary>
            /// <param name="value">ClusterMinLargeMessageSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterMinLargeMessageSize(ConfigNodePropertyInteger value)
            {
                _ClusterMinLargeMessageSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterProducerWindowSize property.
            /// </summary>
            /// <param name="value">ClusterProducerWindowSize</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterProducerWindowSize(ConfigNodePropertyInteger value)
            {
                _ClusterProducerWindowSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterReconnectAttempts property.
            /// </summary>
            /// <param name="value">ClusterReconnectAttempts</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterReconnectAttempts(ConfigNodePropertyInteger value)
            {
                _ClusterReconnectAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterRetryInterval property.
            /// </summary>
            /// <param name="value">ClusterRetryInterval</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterRetryInterval(ConfigNodePropertyInteger value)
            {
                _ClusterRetryInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.ClusterRetryIntervalMultiplier property.
            /// </summary>
            /// <param name="value">ClusterRetryIntervalMultiplier</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder ClusterRetryIntervalMultiplier(ConfigNodePropertyFloat value)
            {
                _ClusterRetryIntervalMultiplier = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties</returns>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(
                    ServiceRanking: _ServiceRanking,
                    GlobalSize: _GlobalSize,
                    MaxDiskUsage: _MaxDiskUsage,
                    PersistenceEnabled: _PersistenceEnabled,
                    ThreadPoolMaxSize: _ThreadPoolMaxSize,
                    ScheduledThreadPoolMaxSize: _ScheduledThreadPoolMaxSize,
                    GracefulShutdownTimeout: _GracefulShutdownTimeout,
                    Queues: _Queues,
                    Topics: _Topics,
                    AddressesMaxDeliveryAttempts: _AddressesMaxDeliveryAttempts,
                    AddressesExpiryDelay: _AddressesExpiryDelay,
                    AddressesAddressFullMessagePolicy: _AddressesAddressFullMessagePolicy,
                    AddressesMaxSizeBytes: _AddressesMaxSizeBytes,
                    AddressesPageSizeBytes: _AddressesPageSizeBytes,
                    AddressesPageCacheMaxSize: _AddressesPageCacheMaxSize,
                    ClusterUser: _ClusterUser,
                    ClusterPassword: _ClusterPassword,
                    ClusterCallTimeout: _ClusterCallTimeout,
                    ClusterCallFailoverTimeout: _ClusterCallFailoverTimeout,
                    ClusterClientFailureCheckPeriod: _ClusterClientFailureCheckPeriod,
                    ClusterNotificationAttempts: _ClusterNotificationAttempts,
                    ClusterNotificationInterval: _ClusterNotificationInterval,
                    IdCacheSize: _IdCacheSize,
                    ClusterConfirmationWindowSize: _ClusterConfirmationWindowSize,
                    ClusterConnectionTtl: _ClusterConnectionTtl,
                    ClusterDuplicateDetection: _ClusterDuplicateDetection,
                    ClusterInitialConnectAttempts: _ClusterInitialConnectAttempts,
                    ClusterMaxRetryInterval: _ClusterMaxRetryInterval,
                    ClusterMinLargeMessageSize: _ClusterMinLargeMessageSize,
                    ClusterProducerWindowSize: _ClusterProducerWindowSize,
                    ClusterReconnectAttempts: _ClusterReconnectAttempts,
                    ClusterRetryInterval: _ClusterRetryInterval,
                    ClusterRetryIntervalMultiplier: _ClusterRetryIntervalMultiplier
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}