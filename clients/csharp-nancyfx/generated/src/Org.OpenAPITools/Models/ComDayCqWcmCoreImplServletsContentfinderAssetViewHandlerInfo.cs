using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo>
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
        public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo left, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo left, ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties _Properties;

            internal ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoBuilder Properties(ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo</returns>
            public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo(
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