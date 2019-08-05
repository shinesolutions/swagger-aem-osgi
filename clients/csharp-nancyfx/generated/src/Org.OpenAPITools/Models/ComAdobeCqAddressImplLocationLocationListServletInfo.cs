using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAddressImplLocationLocationListServletInfo
    /// </summary>
    public sealed class ComAdobeCqAddressImplLocationLocationListServletInfo:  IEquatable<ComAdobeCqAddressImplLocationLocationListServletInfo>
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
        public ComAdobeCqAddressImplLocationLocationListServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAddressImplLocationLocationListServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAddressImplLocationLocationListServletInfo()
        {
        }

        private ComAdobeCqAddressImplLocationLocationListServletInfo(string Pid, string Title, string Description, ComAdobeCqAddressImplLocationLocationListServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAddressImplLocationLocationListServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqAddressImplLocationLocationListServletInfoBuilder</returns>
        public static ComAdobeCqAddressImplLocationLocationListServletInfoBuilder Builder()
        {
            return new ComAdobeCqAddressImplLocationLocationListServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAddressImplLocationLocationListServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAddressImplLocationLocationListServletInfoBuilder</returns>
        public ComAdobeCqAddressImplLocationLocationListServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqAddressImplLocationLocationListServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAddressImplLocationLocationListServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAddressImplLocationLocationListServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqAddressImplLocationLocationListServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAddressImplLocationLocationListServletInfo left, ComAdobeCqAddressImplLocationLocationListServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAddressImplLocationLocationListServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAddressImplLocationLocationListServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqAddressImplLocationLocationListServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAddressImplLocationLocationListServletInfo left, ComAdobeCqAddressImplLocationLocationListServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAddressImplLocationLocationListServletInfo.
        /// </summary>
        public sealed class ComAdobeCqAddressImplLocationLocationListServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAddressImplLocationLocationListServletProperties _Properties;

            internal ComAdobeCqAddressImplLocationLocationListServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAddressImplLocationLocationListServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAddressImplLocationLocationListServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAddressImplLocationLocationListServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAddressImplLocationLocationListServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAddressImplLocationLocationListServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAddressImplLocationLocationListServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAddressImplLocationLocationListServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAddressImplLocationLocationListServletInfoBuilder Properties(ComAdobeCqAddressImplLocationLocationListServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAddressImplLocationLocationListServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqAddressImplLocationLocationListServletInfo</returns>
            public ComAdobeCqAddressImplLocationLocationListServletInfo Build()
            {
                Validate();
                return new ComAdobeCqAddressImplLocationLocationListServletInfo(
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