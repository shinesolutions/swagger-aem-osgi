using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplManagedPollingImporterImplProperties
    /// </summary>
    public sealed class ComDayCqPollingImporterImplManagedPollingImporterImplProperties:  IEquatable<ComDayCqPollingImporterImplManagedPollingImporterImplProperties>
    { 
        /// <summary>
        /// ImporterUser
        /// </summary>
        public ConfigNodePropertyString ImporterUser { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplManagedPollingImporterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplManagedPollingImporterImplProperties()
        {
        }

        private ComDayCqPollingImporterImplManagedPollingImporterImplProperties(ConfigNodePropertyString ImporterUser)
        {
            
            this.ImporterUser = ImporterUser;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder</returns>
        public static ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder Builder()
        {
            return new ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder</returns>
        public ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder With()
        {
            return Builder()
                .ImporterUser(ImporterUser);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqPollingImporterImplManagedPollingImporterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplManagedPollingImporterImplProperties left, ComDayCqPollingImporterImplManagedPollingImporterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplManagedPollingImporterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplManagedPollingImporterImplProperties left, ComDayCqPollingImporterImplManagedPollingImporterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ImporterUser;

            internal ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplManagedPollingImporterImplProperties.ImporterUser property.
            /// </summary>
            /// <param name="value">ImporterUser</param>
            public ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder ImporterUser(ConfigNodePropertyString value)
            {
                _ImporterUser = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplManagedPollingImporterImplProperties.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplManagedPollingImporterImplProperties</returns>
            public ComDayCqPollingImporterImplManagedPollingImporterImplProperties Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplManagedPollingImporterImplProperties(
                    ImporterUser: _ImporterUser
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}