using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo:  IEquatable<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo>
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
        public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo()
        {
        }

        private OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder</returns>
        public static OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder</returns>
        public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo left, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo left, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder Properties(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo</returns>
            public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo(
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