using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingXssImplXSSFilterImplInfo
    /// </summary>
    public sealed class OrgApacheSlingXssImplXSSFilterImplInfo:  IEquatable<OrgApacheSlingXssImplXSSFilterImplInfo>
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
        public OrgApacheSlingXssImplXSSFilterImplProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingXssImplXSSFilterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingXssImplXSSFilterImplInfo()
        {
        }

        private OrgApacheSlingXssImplXSSFilterImplInfo(string Pid, string Title, string Description, OrgApacheSlingXssImplXSSFilterImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingXssImplXSSFilterImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingXssImplXSSFilterImplInfoBuilder</returns>
        public static OrgApacheSlingXssImplXSSFilterImplInfoBuilder Builder()
        {
            return new OrgApacheSlingXssImplXSSFilterImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingXssImplXSSFilterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingXssImplXSSFilterImplInfoBuilder</returns>
        public OrgApacheSlingXssImplXSSFilterImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingXssImplXSSFilterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingXssImplXSSFilterImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingXssImplXSSFilterImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingXssImplXSSFilterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingXssImplXSSFilterImplInfo left, OrgApacheSlingXssImplXSSFilterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingXssImplXSSFilterImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingXssImplXSSFilterImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingXssImplXSSFilterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingXssImplXSSFilterImplInfo left, OrgApacheSlingXssImplXSSFilterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingXssImplXSSFilterImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingXssImplXSSFilterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingXssImplXSSFilterImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingXssImplXSSFilterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder Properties(OrgApacheSlingXssImplXSSFilterImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingXssImplXSSFilterImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingXssImplXSSFilterImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingXssImplXSSFilterImplInfo</returns>
            public OrgApacheSlingXssImplXSSFilterImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingXssImplXSSFilterImplInfo(
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