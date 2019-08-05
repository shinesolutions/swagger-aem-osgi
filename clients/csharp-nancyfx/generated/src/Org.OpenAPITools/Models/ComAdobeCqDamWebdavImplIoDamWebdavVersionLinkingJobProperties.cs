using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties:  IEquatable<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties>
    { 
        /// <summary>
        /// CqDamWebdavVersionLinkingEnable
        /// </summary>
        public ConfigNodePropertyBoolean CqDamWebdavVersionLinkingEnable { get; private set; }

        /// <summary>
        /// CqDamWebdavVersionLinkingSchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger CqDamWebdavVersionLinkingSchedulerPeriod { get; private set; }

        /// <summary>
        /// CqDamWebdavVersionLinkingStagingTimeout
        /// </summary>
        public ConfigNodePropertyInteger CqDamWebdavVersionLinkingStagingTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties()
        {
        }

        private ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(ConfigNodePropertyBoolean CqDamWebdavVersionLinkingEnable, ConfigNodePropertyInteger CqDamWebdavVersionLinkingSchedulerPeriod, ConfigNodePropertyInteger CqDamWebdavVersionLinkingStagingTimeout)
        {
            
            this.CqDamWebdavVersionLinkingEnable = CqDamWebdavVersionLinkingEnable;
            
            this.CqDamWebdavVersionLinkingSchedulerPeriod = CqDamWebdavVersionLinkingSchedulerPeriod;
            
            this.CqDamWebdavVersionLinkingStagingTimeout = CqDamWebdavVersionLinkingStagingTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder</returns>
        public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder With()
        {
            return Builder()
                .CqDamWebdavVersionLinkingEnable(CqDamWebdavVersionLinkingEnable)
                .CqDamWebdavVersionLinkingSchedulerPeriod(CqDamWebdavVersionLinkingSchedulerPeriod)
                .CqDamWebdavVersionLinkingStagingTimeout(CqDamWebdavVersionLinkingStagingTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties left, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties left, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamWebdavVersionLinkingEnable;
            private ConfigNodePropertyInteger _CqDamWebdavVersionLinkingSchedulerPeriod;
            private ConfigNodePropertyInteger _CqDamWebdavVersionLinkingStagingTimeout;

            internal ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.CqDamWebdavVersionLinkingEnable property.
            /// </summary>
            /// <param name="value">CqDamWebdavVersionLinkingEnable</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder CqDamWebdavVersionLinkingEnable(ConfigNodePropertyBoolean value)
            {
                _CqDamWebdavVersionLinkingEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.CqDamWebdavVersionLinkingSchedulerPeriod property.
            /// </summary>
            /// <param name="value">CqDamWebdavVersionLinkingSchedulerPeriod</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder CqDamWebdavVersionLinkingSchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _CqDamWebdavVersionLinkingSchedulerPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.CqDamWebdavVersionLinkingStagingTimeout property.
            /// </summary>
            /// <param name="value">CqDamWebdavVersionLinkingStagingTimeout</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesBuilder CqDamWebdavVersionLinkingStagingTimeout(ConfigNodePropertyInteger value)
            {
                _CqDamWebdavVersionLinkingStagingTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties</returns>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(
                    CqDamWebdavVersionLinkingEnable: _CqDamWebdavVersionLinkingEnable,
                    CqDamWebdavVersionLinkingSchedulerPeriod: _CqDamWebdavVersionLinkingSchedulerPeriod,
                    CqDamWebdavVersionLinkingStagingTimeout: _CqDamWebdavVersionLinkingStagingTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}