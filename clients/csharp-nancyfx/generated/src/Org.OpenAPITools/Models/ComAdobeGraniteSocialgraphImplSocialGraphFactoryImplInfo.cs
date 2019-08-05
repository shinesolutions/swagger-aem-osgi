using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo:  IEquatable<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo>
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
        public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo()
        {
        }

        private ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo(string Pid, string Title, string Description, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder</returns>
        public static ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder</returns>
        public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo left, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo left, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties _Properties;

            internal ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoBuilder Properties(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo</returns>
            public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo(
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