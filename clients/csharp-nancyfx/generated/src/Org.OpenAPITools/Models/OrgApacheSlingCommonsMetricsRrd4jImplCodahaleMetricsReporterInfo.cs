using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo:  IEquatable<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo>
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
        public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo()
        {
        }

        private OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder</returns>
        public static OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder</returns>
        public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo left, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo left, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder Properties(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo</returns>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(
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