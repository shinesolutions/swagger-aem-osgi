using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo:  IEquatable<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo>
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
        public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo(string Pid, string Title, string Description, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo left, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo left, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties _Properties;

            internal ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoBuilder Properties(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo</returns>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo(
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