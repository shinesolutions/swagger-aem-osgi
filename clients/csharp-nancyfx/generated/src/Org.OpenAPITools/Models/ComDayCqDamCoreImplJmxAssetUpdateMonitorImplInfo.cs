using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo:  IEquatable<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo>
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
        public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo()
        {
        }

        private ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo left, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo left, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties _Properties;

            internal ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoBuilder Properties(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo</returns>
            public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo(
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