using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo:  IEquatable<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo>
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
        public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties Properties { get; private set; }

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
        /// Use ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo()
        {
        }

        private ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo left, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo left, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder Properties(ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo</returns>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo(
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