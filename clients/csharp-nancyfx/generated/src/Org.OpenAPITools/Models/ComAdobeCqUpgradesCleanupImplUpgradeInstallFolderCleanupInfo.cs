using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo
    /// </summary>
    public sealed class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo:  IEquatable<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo()
        {
        }

        private ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo(string Pid, string Title, string Description, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder</returns>
        public static ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder Builder()
        {
            return new ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder</returns>
        public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo left, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo left, ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.
        /// </summary>
        public sealed class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties _Properties;

            internal ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoBuilder Properties(ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo.
            /// </summary>
            /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo</returns>
            public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo Build()
            {
                Validate();
                return new ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}