using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo:  IEquatable<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo>
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
        public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo()
        {
        }

        private ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo(string Pid, string Title, string Description, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder</returns>
        public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo left, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo left, ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties _Properties;

            internal ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoBuilder Properties(ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo</returns>
            public ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo(
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