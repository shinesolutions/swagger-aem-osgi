using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties>
    { 
        /// <summary>
        /// ThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger ThreadPoolSize { get; private set; }

        /// <summary>
        /// DelayTime
        /// </summary>
        public ConfigNodePropertyInteger DelayTime { get; private set; }

        /// <summary>
        /// WorkerSleepTime
        /// </summary>
        public ConfigNodePropertyInteger WorkerSleepTime { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(ConfigNodePropertyInteger ThreadPoolSize, ConfigNodePropertyInteger DelayTime, ConfigNodePropertyInteger WorkerSleepTime)
        {
            
            this.ThreadPoolSize = ThreadPoolSize;
            
            this.DelayTime = DelayTime;
            
            this.WorkerSleepTime = WorkerSleepTime;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ThreadPoolSize(ThreadPoolSize)
                .DelayTime(DelayTime)
                .WorkerSleepTime(WorkerSleepTime);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties left, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties left, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ThreadPoolSize;
            private ConfigNodePropertyInteger _DelayTime;
            private ConfigNodePropertyInteger _WorkerSleepTime;

            internal ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.ThreadPoolSize property.
            /// </summary>
            /// <param name="value">ThreadPoolSize</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder ThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _ThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.DelayTime property.
            /// </summary>
            /// <param name="value">DelayTime</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder DelayTime(ConfigNodePropertyInteger value)
            {
                _DelayTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.WorkerSleepTime property.
            /// </summary>
            /// <param name="value">WorkerSleepTime</param>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesBuilder WorkerSleepTime(ConfigNodePropertyInteger value)
            {
                _WorkerSleepTime = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties</returns>
            public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(
                    ThreadPoolSize: _ThreadPoolSize,
                    DelayTime: _DelayTime,
                    WorkerSleepTime: _WorkerSleepTime
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}