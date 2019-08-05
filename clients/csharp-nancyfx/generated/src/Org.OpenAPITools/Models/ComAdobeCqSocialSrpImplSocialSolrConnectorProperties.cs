using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties:  IEquatable<ComAdobeCqSocialSrpImplSocialSolrConnectorProperties>
    { 
        /// <summary>
        /// SrpType
        /// </summary>
        public ConfigNodePropertyString SrpType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties()
        {
        }

        private ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(ConfigNodePropertyString SrpType)
        {
            
            this.SrpType = SrpType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder</returns>
        public static ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder</returns>
        public ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder With()
        {
            return Builder()
                .SrpType(SrpType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSrpImplSocialSolrConnectorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties left, ComAdobeCqSocialSrpImplSocialSolrConnectorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties left, ComAdobeCqSocialSrpImplSocialSolrConnectorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder
        {
            private ConfigNodePropertyString _SrpType;

            internal ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.SrpType property.
            /// </summary>
            /// <param name="value">SrpType</param>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder SrpType(ConfigNodePropertyString value)
            {
                _SrpType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSrpImplSocialSolrConnectorProperties</returns>
            public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(
                    SrpType: _SrpType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}