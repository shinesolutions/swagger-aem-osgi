using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo:  IEquatable<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo>
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
        public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo()
        {
        }

        private ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo(string Pid, string Title, string Description, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder</returns>
        public static ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder</returns>
        public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo left, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo left, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties _Properties;

            internal ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoBuilder Properties(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo</returns>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo(
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