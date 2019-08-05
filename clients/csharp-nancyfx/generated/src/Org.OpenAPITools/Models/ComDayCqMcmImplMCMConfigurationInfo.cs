using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmImplMCMConfigurationInfo
    /// </summary>
    public sealed class ComDayCqMcmImplMCMConfigurationInfo:  IEquatable<ComDayCqMcmImplMCMConfigurationInfo>
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
        public ComDayCqMcmImplMCMConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmImplMCMConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmImplMCMConfigurationInfo()
        {
        }

        private ComDayCqMcmImplMCMConfigurationInfo(string Pid, string Title, string Description, ComDayCqMcmImplMCMConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmImplMCMConfigurationInfo.
        /// </summary>
        /// <returns>ComDayCqMcmImplMCMConfigurationInfoBuilder</returns>
        public static ComDayCqMcmImplMCMConfigurationInfoBuilder Builder()
        {
            return new ComDayCqMcmImplMCMConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmImplMCMConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmImplMCMConfigurationInfoBuilder</returns>
        public ComDayCqMcmImplMCMConfigurationInfoBuilder With()
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

        public bool Equals(ComDayCqMcmImplMCMConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmImplMCMConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmImplMCMConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqMcmImplMCMConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmImplMCMConfigurationInfo left, ComDayCqMcmImplMCMConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmImplMCMConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmImplMCMConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqMcmImplMCMConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmImplMCMConfigurationInfo left, ComDayCqMcmImplMCMConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmImplMCMConfigurationInfo.
        /// </summary>
        public sealed class ComDayCqMcmImplMCMConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmImplMCMConfigurationProperties _Properties;

            internal ComDayCqMcmImplMCMConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmImplMCMConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmImplMCMConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmImplMCMConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmImplMCMConfigurationInfoBuilder Properties(ComDayCqMcmImplMCMConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmImplMCMConfigurationInfo.
            /// </summary>
            /// <returns>ComDayCqMcmImplMCMConfigurationInfo</returns>
            public ComDayCqMcmImplMCMConfigurationInfo Build()
            {
                Validate();
                return new ComDayCqMcmImplMCMConfigurationInfo(
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