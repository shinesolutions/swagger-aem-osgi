using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo:  IEquatable<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo>
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
        public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo left, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo left, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties _Properties;

            internal ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoBuilder Properties(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo</returns>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo(
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