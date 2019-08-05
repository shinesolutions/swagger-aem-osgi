using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo:  IEquatable<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo>
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
        public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo left, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo left, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties _Properties;

            internal ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoBuilder Properties(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo</returns>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo(
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