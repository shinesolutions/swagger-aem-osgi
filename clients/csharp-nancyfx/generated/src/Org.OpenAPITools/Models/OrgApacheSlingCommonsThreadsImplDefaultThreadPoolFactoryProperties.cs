using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties:  IEquatable<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// MinPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MinPoolSize { get; private set; }

        /// <summary>
        /// MaxPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MaxPoolSize { get; private set; }

        /// <summary>
        /// QueueSize
        /// </summary>
        public ConfigNodePropertyInteger QueueSize { get; private set; }

        /// <summary>
        /// MaxThreadAge
        /// </summary>
        public ConfigNodePropertyInteger MaxThreadAge { get; private set; }

        /// <summary>
        /// KeepAliveTime
        /// </summary>
        public ConfigNodePropertyInteger KeepAliveTime { get; private set; }

        /// <summary>
        /// BlockPolicy
        /// </summary>
        public ConfigNodePropertyDropDown BlockPolicy { get; private set; }

        /// <summary>
        /// ShutdownGraceful
        /// </summary>
        public ConfigNodePropertyBoolean ShutdownGraceful { get; private set; }

        /// <summary>
        /// Daemon
        /// </summary>
        public ConfigNodePropertyBoolean Daemon { get; private set; }

        /// <summary>
        /// ShutdownWaitTime
        /// </summary>
        public ConfigNodePropertyInteger ShutdownWaitTime { get; private set; }

        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyDropDown Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
        {
        }

        private OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(ConfigNodePropertyString Name, ConfigNodePropertyInteger MinPoolSize, ConfigNodePropertyInteger MaxPoolSize, ConfigNodePropertyInteger QueueSize, ConfigNodePropertyInteger MaxThreadAge, ConfigNodePropertyInteger KeepAliveTime, ConfigNodePropertyDropDown BlockPolicy, ConfigNodePropertyBoolean ShutdownGraceful, ConfigNodePropertyBoolean Daemon, ConfigNodePropertyInteger ShutdownWaitTime, ConfigNodePropertyDropDown Priority)
        {
            
            this.Name = Name;
            
            this.MinPoolSize = MinPoolSize;
            
            this.MaxPoolSize = MaxPoolSize;
            
            this.QueueSize = QueueSize;
            
            this.MaxThreadAge = MaxThreadAge;
            
            this.KeepAliveTime = KeepAliveTime;
            
            this.BlockPolicy = BlockPolicy;
            
            this.ShutdownGraceful = ShutdownGraceful;
            
            this.Daemon = Daemon;
            
            this.ShutdownWaitTime = ShutdownWaitTime;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder</returns>
        public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .MinPoolSize(MinPoolSize)
                .MaxPoolSize(MaxPoolSize)
                .QueueSize(QueueSize)
                .MaxThreadAge(MaxThreadAge)
                .KeepAliveTime(KeepAliveTime)
                .BlockPolicy(BlockPolicy)
                .ShutdownGraceful(ShutdownGraceful)
                .Daemon(Daemon)
                .ShutdownWaitTime(ShutdownWaitTime)
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties left, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties left, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyInteger _MinPoolSize;
            private ConfigNodePropertyInteger _MaxPoolSize;
            private ConfigNodePropertyInteger _QueueSize;
            private ConfigNodePropertyInteger _MaxThreadAge;
            private ConfigNodePropertyInteger _KeepAliveTime;
            private ConfigNodePropertyDropDown _BlockPolicy;
            private ConfigNodePropertyBoolean _ShutdownGraceful;
            private ConfigNodePropertyBoolean _Daemon;
            private ConfigNodePropertyInteger _ShutdownWaitTime;
            private ConfigNodePropertyDropDown _Priority;

            internal OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.MinPoolSize property.
            /// </summary>
            /// <param name="value">MinPoolSize</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder MinPoolSize(ConfigNodePropertyInteger value)
            {
                _MinPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.MaxPoolSize property.
            /// </summary>
            /// <param name="value">MaxPoolSize</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder MaxPoolSize(ConfigNodePropertyInteger value)
            {
                _MaxPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.QueueSize property.
            /// </summary>
            /// <param name="value">QueueSize</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder QueueSize(ConfigNodePropertyInteger value)
            {
                _QueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.MaxThreadAge property.
            /// </summary>
            /// <param name="value">MaxThreadAge</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder MaxThreadAge(ConfigNodePropertyInteger value)
            {
                _MaxThreadAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.KeepAliveTime property.
            /// </summary>
            /// <param name="value">KeepAliveTime</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder KeepAliveTime(ConfigNodePropertyInteger value)
            {
                _KeepAliveTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.BlockPolicy property.
            /// </summary>
            /// <param name="value">BlockPolicy</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder BlockPolicy(ConfigNodePropertyDropDown value)
            {
                _BlockPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.ShutdownGraceful property.
            /// </summary>
            /// <param name="value">ShutdownGraceful</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder ShutdownGraceful(ConfigNodePropertyBoolean value)
            {
                _ShutdownGraceful = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.Daemon property.
            /// </summary>
            /// <param name="value">Daemon</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder Daemon(ConfigNodePropertyBoolean value)
            {
                _Daemon = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.ShutdownWaitTime property.
            /// </summary>
            /// <param name="value">ShutdownWaitTime</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder ShutdownWaitTime(ConfigNodePropertyInteger value)
            {
                _ShutdownWaitTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder Priority(ConfigNodePropertyDropDown value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties</returns>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
                    Name: _Name,
                    MinPoolSize: _MinPoolSize,
                    MaxPoolSize: _MaxPoolSize,
                    QueueSize: _QueueSize,
                    MaxThreadAge: _MaxThreadAge,
                    KeepAliveTime: _KeepAliveTime,
                    BlockPolicy: _BlockPolicy,
                    ShutdownGraceful: _ShutdownGraceful,
                    Daemon: _Daemon,
                    ShutdownWaitTime: _ShutdownWaitTime,
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}