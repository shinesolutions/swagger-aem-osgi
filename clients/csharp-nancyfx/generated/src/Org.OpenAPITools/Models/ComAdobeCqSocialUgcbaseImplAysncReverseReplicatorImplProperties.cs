using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties>
    { 
        /// <summary>
        /// PoolSize
        /// </summary>
        public ConfigNodePropertyInteger PoolSize { get; private set; }

        /// <summary>
        /// MaxPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MaxPoolSize { get; private set; }

        /// <summary>
        /// QueueSize
        /// </summary>
        public ConfigNodePropertyInteger QueueSize { get; private set; }

        /// <summary>
        /// KeepAliveTime
        /// </summary>
        public ConfigNodePropertyInteger KeepAliveTime { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(ConfigNodePropertyInteger PoolSize, ConfigNodePropertyInteger MaxPoolSize, ConfigNodePropertyInteger QueueSize, ConfigNodePropertyInteger KeepAliveTime)
        {
            
            this.PoolSize = PoolSize;
            
            this.MaxPoolSize = MaxPoolSize;
            
            this.QueueSize = QueueSize;
            
            this.KeepAliveTime = KeepAliveTime;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder With()
        {
            return Builder()
                .PoolSize(PoolSize)
                .MaxPoolSize(MaxPoolSize)
                .QueueSize(QueueSize)
                .KeepAliveTime(KeepAliveTime);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties left, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties left, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _PoolSize;
            private ConfigNodePropertyInteger _MaxPoolSize;
            private ConfigNodePropertyInteger _QueueSize;
            private ConfigNodePropertyInteger _KeepAliveTime;

            internal ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.PoolSize property.
            /// </summary>
            /// <param name="value">PoolSize</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder PoolSize(ConfigNodePropertyInteger value)
            {
                _PoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.MaxPoolSize property.
            /// </summary>
            /// <param name="value">MaxPoolSize</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder MaxPoolSize(ConfigNodePropertyInteger value)
            {
                _MaxPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.QueueSize property.
            /// </summary>
            /// <param name="value">QueueSize</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder QueueSize(ConfigNodePropertyInteger value)
            {
                _QueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.KeepAliveTime property.
            /// </summary>
            /// <param name="value">KeepAliveTime</param>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesBuilder KeepAliveTime(ConfigNodePropertyInteger value)
            {
                _KeepAliveTime = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties</returns>
            public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
                    PoolSize: _PoolSize,
                    MaxPoolSize: _MaxPoolSize,
                    QueueSize: _QueueSize,
                    KeepAliveTime: _KeepAliveTime
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}