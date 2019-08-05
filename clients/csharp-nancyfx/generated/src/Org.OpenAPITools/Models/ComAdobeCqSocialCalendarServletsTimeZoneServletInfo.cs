using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarServletsTimeZoneServletInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarServletsTimeZoneServletInfo:  IEquatable<ComAdobeCqSocialCalendarServletsTimeZoneServletInfo>
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
        public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarServletsTimeZoneServletInfo()
        {
        }

        private ComAdobeCqSocialCalendarServletsTimeZoneServletInfo(string Pid, string Title, string Description, ComAdobeCqSocialCalendarServletsTimeZoneServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder</returns>
        public static ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder</returns>
        public ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCalendarServletsTimeZoneServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo left, ComAdobeCqSocialCalendarServletsTimeZoneServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarServletsTimeZoneServletInfo left, ComAdobeCqSocialCalendarServletsTimeZoneServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCalendarServletsTimeZoneServletProperties _Properties;

            internal ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletInfoBuilder Properties(ComAdobeCqSocialCalendarServletsTimeZoneServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarServletsTimeZoneServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarServletsTimeZoneServletInfo</returns>
            public ComAdobeCqSocialCalendarServletsTimeZoneServletInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarServletsTimeZoneServletInfo(
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