using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo
    /// </summary>
    public sealed class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo:  IEquatable<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo>
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
        public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo()
        {
        }

        private ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo(string Pid, string Title, string Description, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder</returns>
        public static ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder Builder()
        {
            return new ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder</returns>
        public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo left, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo left, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties _Properties;

            internal ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoBuilder Properties(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo</returns>
            public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo(
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