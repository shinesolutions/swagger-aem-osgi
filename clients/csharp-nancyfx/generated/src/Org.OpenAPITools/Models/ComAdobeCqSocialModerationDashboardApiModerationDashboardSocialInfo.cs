using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo:  IEquatable<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo>
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
        public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo(string Pid, string Title, string Description, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo left, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo left, ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties _Properties;

            internal ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoBuilder Properties(ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo</returns>
            public ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo(
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