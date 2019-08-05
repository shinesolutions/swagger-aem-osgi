using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo>
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
        public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo</returns>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo(
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