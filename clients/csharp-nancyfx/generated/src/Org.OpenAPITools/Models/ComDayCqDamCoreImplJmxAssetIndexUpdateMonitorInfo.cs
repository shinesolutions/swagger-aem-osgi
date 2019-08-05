using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo:  IEquatable<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo>
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
        public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo()
        {
        }

        private ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo left, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo left, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties _Properties;

            internal ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoBuilder Properties(ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo</returns>
            public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}