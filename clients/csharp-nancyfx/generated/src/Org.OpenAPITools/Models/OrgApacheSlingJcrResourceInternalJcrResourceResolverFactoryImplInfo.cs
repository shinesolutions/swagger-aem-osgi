using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo:  IEquatable<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo>
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
        public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo()
        {
        }

        private OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo(string Pid, string Title, string Description, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder</returns>
        public static OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder</returns>
        public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo left, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo left, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder Properties(OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo</returns>
            public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo(
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