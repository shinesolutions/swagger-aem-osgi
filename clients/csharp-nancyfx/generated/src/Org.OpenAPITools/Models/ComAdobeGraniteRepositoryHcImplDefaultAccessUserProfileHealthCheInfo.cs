using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo>
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
        public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo left, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo left, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo</returns>
            public ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo(
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