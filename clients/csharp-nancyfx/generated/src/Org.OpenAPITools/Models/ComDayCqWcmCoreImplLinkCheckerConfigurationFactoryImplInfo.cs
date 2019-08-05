using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo:  IEquatable<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo>
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
        public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo()
        {
        }

        private ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo left, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo left, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties _Properties;

            internal ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoBuilder Properties(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo</returns>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(
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