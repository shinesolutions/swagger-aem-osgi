using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplSlingMainServletInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineImplSlingMainServletInfo:  IEquatable<OrgApacheSlingEngineImplSlingMainServletInfo>
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
        public OrgApacheSlingEngineImplSlingMainServletProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingEngineImplSlingMainServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplSlingMainServletInfo()
        {
        }

        private OrgApacheSlingEngineImplSlingMainServletInfo(string Pid, string Title, string Description, OrgApacheSlingEngineImplSlingMainServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplSlingMainServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplSlingMainServletInfoBuilder</returns>
        public static OrgApacheSlingEngineImplSlingMainServletInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineImplSlingMainServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplSlingMainServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplSlingMainServletInfoBuilder</returns>
        public OrgApacheSlingEngineImplSlingMainServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineImplSlingMainServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplSlingMainServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplSlingMainServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplSlingMainServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplSlingMainServletInfo left, OrgApacheSlingEngineImplSlingMainServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplSlingMainServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplSlingMainServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplSlingMainServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplSlingMainServletInfo left, OrgApacheSlingEngineImplSlingMainServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplSlingMainServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplSlingMainServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineImplSlingMainServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingEngineImplSlingMainServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder Properties(OrgApacheSlingEngineImplSlingMainServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingEngineImplSlingMainServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplSlingMainServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplSlingMainServletInfo</returns>
            public OrgApacheSlingEngineImplSlingMainServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplSlingMainServletInfo(
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