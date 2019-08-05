using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo:  IEquatable<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo>
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
        public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo()
        {
        }

        private ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder</returns>
        public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo left, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo left, ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties _Properties;

            internal ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoBuilder Properties(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo</returns>
            public ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo(
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