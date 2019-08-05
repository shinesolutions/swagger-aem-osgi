using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo
    /// </summary>
    public sealed class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo:  IEquatable<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo>
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
        public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo()
        {
        }

        private ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo(string Pid, string Title, string Description, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder</returns>
        public static ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder Builder()
        {
            return new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder</returns>
        public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo left, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo left, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.
        /// </summary>
        public sealed class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties _Properties;

            internal ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoBuilder Properties(ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo</returns>
            public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo Build()
            {
                Validate();
                return new ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo(
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