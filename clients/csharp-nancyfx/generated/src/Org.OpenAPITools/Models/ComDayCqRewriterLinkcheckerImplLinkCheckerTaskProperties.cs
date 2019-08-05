using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>
    { 
        /// <summary>
        /// SchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger SchedulerPeriod { get; private set; }

        /// <summary>
        /// SchedulerConcurrent
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; private set; }

        /// <summary>
        /// GoodLinkTestInterval
        /// </summary>
        public ConfigNodePropertyInteger GoodLinkTestInterval { get; private set; }

        /// <summary>
        /// BadLinkTestInterval
        /// </summary>
        public ConfigNodePropertyInteger BadLinkTestInterval { get; private set; }

        /// <summary>
        /// LinkUnusedInterval
        /// </summary>
        public ConfigNodePropertyInteger LinkUnusedInterval { get; private set; }

        /// <summary>
        /// ConnectionTimeout
        /// </summary>
        public ConfigNodePropertyInteger ConnectionTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(ConfigNodePropertyInteger SchedulerPeriod, ConfigNodePropertyBoolean SchedulerConcurrent, ConfigNodePropertyInteger GoodLinkTestInterval, ConfigNodePropertyInteger BadLinkTestInterval, ConfigNodePropertyInteger LinkUnusedInterval, ConfigNodePropertyInteger ConnectionTimeout)
        {
            
            this.SchedulerPeriod = SchedulerPeriod;
            
            this.SchedulerConcurrent = SchedulerConcurrent;
            
            this.GoodLinkTestInterval = GoodLinkTestInterval;
            
            this.BadLinkTestInterval = BadLinkTestInterval;
            
            this.LinkUnusedInterval = LinkUnusedInterval;
            
            this.ConnectionTimeout = ConnectionTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder With()
        {
            return Builder()
                .SchedulerPeriod(SchedulerPeriod)
                .SchedulerConcurrent(SchedulerConcurrent)
                .GoodLinkTestInterval(GoodLinkTestInterval)
                .BadLinkTestInterval(BadLinkTestInterval)
                .LinkUnusedInterval(LinkUnusedInterval)
                .ConnectionTimeout(ConnectionTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SchedulerPeriod;
            private ConfigNodePropertyBoolean _SchedulerConcurrent;
            private ConfigNodePropertyInteger _GoodLinkTestInterval;
            private ConfigNodePropertyInteger _BadLinkTestInterval;
            private ConfigNodePropertyInteger _LinkUnusedInterval;
            private ConfigNodePropertyInteger _ConnectionTimeout;

            internal ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.SchedulerPeriod property.
            /// </summary>
            /// <param name="value">SchedulerPeriod</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder SchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _SchedulerPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.SchedulerConcurrent property.
            /// </summary>
            /// <param name="value">SchedulerConcurrent</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder SchedulerConcurrent(ConfigNodePropertyBoolean value)
            {
                _SchedulerConcurrent = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.GoodLinkTestInterval property.
            /// </summary>
            /// <param name="value">GoodLinkTestInterval</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder GoodLinkTestInterval(ConfigNodePropertyInteger value)
            {
                _GoodLinkTestInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.BadLinkTestInterval property.
            /// </summary>
            /// <param name="value">BadLinkTestInterval</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder BadLinkTestInterval(ConfigNodePropertyInteger value)
            {
                _BadLinkTestInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.LinkUnusedInterval property.
            /// </summary>
            /// <param name="value">LinkUnusedInterval</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder LinkUnusedInterval(ConfigNodePropertyInteger value)
            {
                _LinkUnusedInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.ConnectionTimeout property.
            /// </summary>
            /// <param name="value">ConnectionTimeout</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBuilder ConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectionTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties</returns>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
                    SchedulerPeriod: _SchedulerPeriod,
                    SchedulerConcurrent: _SchedulerConcurrent,
                    GoodLinkTestInterval: _GoodLinkTestInterval,
                    BadLinkTestInterval: _BadLinkTestInterval,
                    LinkUnusedInterval: _LinkUnusedInterval,
                    ConnectionTimeout: _ConnectionTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}