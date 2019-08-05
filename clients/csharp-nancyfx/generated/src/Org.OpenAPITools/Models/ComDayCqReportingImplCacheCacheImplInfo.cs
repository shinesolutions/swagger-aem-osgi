using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplCacheCacheImplInfo
    /// </summary>
    public sealed class ComDayCqReportingImplCacheCacheImplInfo:  IEquatable<ComDayCqReportingImplCacheCacheImplInfo>
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
        public ComDayCqReportingImplCacheCacheImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplCacheCacheImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplCacheCacheImplInfo()
        {
        }

        private ComDayCqReportingImplCacheCacheImplInfo(string Pid, string Title, string Description, ComDayCqReportingImplCacheCacheImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplCacheCacheImplInfo.
        /// </summary>
        /// <returns>ComDayCqReportingImplCacheCacheImplInfoBuilder</returns>
        public static ComDayCqReportingImplCacheCacheImplInfoBuilder Builder()
        {
            return new ComDayCqReportingImplCacheCacheImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplCacheCacheImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplCacheCacheImplInfoBuilder</returns>
        public ComDayCqReportingImplCacheCacheImplInfoBuilder With()
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

        public bool Equals(ComDayCqReportingImplCacheCacheImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplCacheCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplCacheCacheImplInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplCacheCacheImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplCacheCacheImplInfo left, ComDayCqReportingImplCacheCacheImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplCacheCacheImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplCacheCacheImplInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplCacheCacheImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplCacheCacheImplInfo left, ComDayCqReportingImplCacheCacheImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplCacheCacheImplInfo.
        /// </summary>
        public sealed class ComDayCqReportingImplCacheCacheImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReportingImplCacheCacheImplProperties _Properties;

            internal ComDayCqReportingImplCacheCacheImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReportingImplCacheCacheImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReportingImplCacheCacheImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReportingImplCacheCacheImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplCacheCacheImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReportingImplCacheCacheImplInfoBuilder Properties(ComDayCqReportingImplCacheCacheImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplCacheCacheImplInfo.
            /// </summary>
            /// <returns>ComDayCqReportingImplCacheCacheImplInfo</returns>
            public ComDayCqReportingImplCacheCacheImplInfo Build()
            {
                Validate();
                return new ComDayCqReportingImplCacheCacheImplInfo(
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