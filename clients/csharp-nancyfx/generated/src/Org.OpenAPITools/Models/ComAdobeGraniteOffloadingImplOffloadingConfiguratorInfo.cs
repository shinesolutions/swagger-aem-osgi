using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo:  IEquatable<ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo>
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
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo()
        {
        }

        private ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo(string Pid, string Title, string Description, ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder</returns>
        public static ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder</returns>
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo left, ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo left, ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties _Properties;

            internal ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfoBuilder Properties(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo</returns>
            public ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo(
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