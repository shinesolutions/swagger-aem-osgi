using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplJobsJobConsumerManagerInfo
    /// </summary>
    public sealed class OrgApacheSlingEventImplJobsJobConsumerManagerInfo:  IEquatable<OrgApacheSlingEventImplJobsJobConsumerManagerInfo>
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
        public OrgApacheSlingEventImplJobsJobConsumerManagerProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingEventImplJobsJobConsumerManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplJobsJobConsumerManagerInfo()
        {
        }

        private OrgApacheSlingEventImplJobsJobConsumerManagerInfo(string Pid, string Title, string Description, OrgApacheSlingEventImplJobsJobConsumerManagerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplJobsJobConsumerManagerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder</returns>
        public static OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder Builder()
        {
            return new OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder</returns>
        public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEventImplJobsJobConsumerManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplJobsJobConsumerManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplJobsJobConsumerManagerInfo left, OrgApacheSlingEventImplJobsJobConsumerManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplJobsJobConsumerManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsJobConsumerManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplJobsJobConsumerManagerInfo left, OrgApacheSlingEventImplJobsJobConsumerManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplJobsJobConsumerManagerInfo.
        /// </summary>
        public sealed class OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEventImplJobsJobConsumerManagerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder Properties(OrgApacheSlingEventImplJobsJobConsumerManagerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsJobConsumerManagerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplJobsJobConsumerManagerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplJobsJobConsumerManagerInfo</returns>
            public OrgApacheSlingEventImplJobsJobConsumerManagerInfo Build()
            {
                Validate();
                return new OrgApacheSlingEventImplJobsJobConsumerManagerInfo(
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