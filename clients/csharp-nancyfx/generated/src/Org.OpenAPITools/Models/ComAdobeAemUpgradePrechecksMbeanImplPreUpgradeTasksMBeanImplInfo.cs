using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo:  IEquatable<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo>
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
        public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo()
        {
        }

        private ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo(string Pid, string Title, string Description, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder</returns>
        public static ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder</returns>
        public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo left, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo left, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder Properties(ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo</returns>
            public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}