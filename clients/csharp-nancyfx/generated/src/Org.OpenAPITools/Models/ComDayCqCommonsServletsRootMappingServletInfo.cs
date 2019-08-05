using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCommonsServletsRootMappingServletInfo
    /// </summary>
    public sealed class ComDayCqCommonsServletsRootMappingServletInfo:  IEquatable<ComDayCqCommonsServletsRootMappingServletInfo>
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
        public ComDayCqCommonsServletsRootMappingServletProperties Properties { get; private set; }

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
        /// Use ComDayCqCommonsServletsRootMappingServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCommonsServletsRootMappingServletInfo()
        {
        }

        private ComDayCqCommonsServletsRootMappingServletInfo(string Pid, string Title, string Description, ComDayCqCommonsServletsRootMappingServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCommonsServletsRootMappingServletInfo.
        /// </summary>
        /// <returns>ComDayCqCommonsServletsRootMappingServletInfoBuilder</returns>
        public static ComDayCqCommonsServletsRootMappingServletInfoBuilder Builder()
        {
            return new ComDayCqCommonsServletsRootMappingServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCommonsServletsRootMappingServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCommonsServletsRootMappingServletInfoBuilder</returns>
        public ComDayCqCommonsServletsRootMappingServletInfoBuilder With()
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

        public bool Equals(ComDayCqCommonsServletsRootMappingServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCommonsServletsRootMappingServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsServletsRootMappingServletInfo</param>
        /// <param name="right">Compared (ComDayCqCommonsServletsRootMappingServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCommonsServletsRootMappingServletInfo left, ComDayCqCommonsServletsRootMappingServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCommonsServletsRootMappingServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsServletsRootMappingServletInfo</param>
        /// <param name="right">Compared (ComDayCqCommonsServletsRootMappingServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCommonsServletsRootMappingServletInfo left, ComDayCqCommonsServletsRootMappingServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCommonsServletsRootMappingServletInfo.
        /// </summary>
        public sealed class ComDayCqCommonsServletsRootMappingServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqCommonsServletsRootMappingServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqCommonsServletsRootMappingServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder Properties(ComDayCqCommonsServletsRootMappingServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqCommonsServletsRootMappingServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCommonsServletsRootMappingServletInfo.
            /// </summary>
            /// <returns>ComDayCqCommonsServletsRootMappingServletInfo</returns>
            public ComDayCqCommonsServletsRootMappingServletInfo Build()
            {
                Validate();
                return new ComDayCqCommonsServletsRootMappingServletInfo(
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