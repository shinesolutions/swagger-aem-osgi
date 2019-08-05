using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo
    /// </summary>
    public sealed class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo:  IEquatable<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo>
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
        public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo()
        {
        }

        private ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo(string Pid, string Title, string Description, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder</returns>
        public static ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder Builder()
        {
            return new ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder</returns>
        public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder With()
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

        public bool Equals(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo left, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo</param>
        /// <param name="right">Compared (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo left, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.
        /// </summary>
        public sealed class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties _Properties;

            internal ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoBuilder Properties(ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo.
            /// </summary>
            /// <returns>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo</returns>
            public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo Build()
            {
                Validate();
                return new ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo(
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