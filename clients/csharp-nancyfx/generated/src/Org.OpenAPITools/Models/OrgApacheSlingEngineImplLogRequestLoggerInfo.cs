using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplLogRequestLoggerInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineImplLogRequestLoggerInfo:  IEquatable<OrgApacheSlingEngineImplLogRequestLoggerInfo>
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
        public OrgApacheSlingEngineImplLogRequestLoggerProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingEngineImplLogRequestLoggerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplLogRequestLoggerInfo()
        {
        }

        private OrgApacheSlingEngineImplLogRequestLoggerInfo(string Pid, string Title, string Description, OrgApacheSlingEngineImplLogRequestLoggerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplLogRequestLoggerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder</returns>
        public static OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder</returns>
        public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineImplLogRequestLoggerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplLogRequestLoggerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplLogRequestLoggerInfo left, OrgApacheSlingEngineImplLogRequestLoggerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplLogRequestLoggerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplLogRequestLoggerInfo left, OrgApacheSlingEngineImplLogRequestLoggerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplLogRequestLoggerInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineImplLogRequestLoggerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder Properties(OrgApacheSlingEngineImplLogRequestLoggerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingEngineImplLogRequestLoggerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplLogRequestLoggerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplLogRequestLoggerInfo</returns>
            public OrgApacheSlingEngineImplLogRequestLoggerInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplLogRequestLoggerInfo(
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