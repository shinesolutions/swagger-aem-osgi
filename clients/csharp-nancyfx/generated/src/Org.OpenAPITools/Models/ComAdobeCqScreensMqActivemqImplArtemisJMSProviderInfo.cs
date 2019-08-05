using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo
    /// </summary>
    public sealed class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo:  IEquatable<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo>
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
        public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo()
        {
        }

        private ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo(string Pid, string Title, string Description, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder</returns>
        public static ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder Builder()
        {
            return new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder</returns>
        public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo left, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo left, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties _Properties;

            internal ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoBuilder Properties(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo</returns>
            public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo(
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