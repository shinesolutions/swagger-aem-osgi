using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
    /// </summary>
    public sealed class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties:  IEquatable<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties>
    { 
        /// <summary>
        /// DeleteNameRegexps
        /// </summary>
        public ConfigNodePropertyArray DeleteNameRegexps { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties()
        {
        }

        private ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(ConfigNodePropertyArray DeleteNameRegexps)
        {
            
            this.DeleteNameRegexps = DeleteNameRegexps;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder</returns>
        public static ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder Builder()
        {
            return new ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder</returns>
        public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder With()
        {
            return Builder()
                .DeleteNameRegexps(DeleteNameRegexps);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties left, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties left, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
        /// </summary>
        public sealed class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder
        {
            private ConfigNodePropertyArray _DeleteNameRegexps;

            internal ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.DeleteNameRegexps property.
            /// </summary>
            /// <param name="value">DeleteNameRegexps</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesBuilder DeleteNameRegexps(ConfigNodePropertyArray value)
            {
                _DeleteNameRegexps = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
            /// </summary>
            /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</returns>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties Build()
            {
                Validate();
                return new ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(
                    DeleteNameRegexps: _DeleteNameRegexps
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}