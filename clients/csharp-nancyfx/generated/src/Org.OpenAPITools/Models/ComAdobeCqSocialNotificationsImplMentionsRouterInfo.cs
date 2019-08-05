using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplMentionsRouterInfo
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplMentionsRouterInfo:  IEquatable<ComAdobeCqSocialNotificationsImplMentionsRouterInfo>
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
        public ComAdobeCqSocialNotificationsImplMentionsRouterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialNotificationsImplMentionsRouterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplMentionsRouterInfo()
        {
        }

        private ComAdobeCqSocialNotificationsImplMentionsRouterInfo(string Pid, string Title, string Description, ComAdobeCqSocialNotificationsImplMentionsRouterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplMentionsRouterInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder</returns>
        public ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialNotificationsImplMentionsRouterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplMentionsRouterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplMentionsRouterInfo left, ComAdobeCqSocialNotificationsImplMentionsRouterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplMentionsRouterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplMentionsRouterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplMentionsRouterInfo left, ComAdobeCqSocialNotificationsImplMentionsRouterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplMentionsRouterInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialNotificationsImplMentionsRouterProperties _Properties;

            internal ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplMentionsRouterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialNotificationsImplMentionsRouterInfoBuilder Properties(ComAdobeCqSocialNotificationsImplMentionsRouterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplMentionsRouterInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplMentionsRouterInfo</returns>
            public ComAdobeCqSocialNotificationsImplMentionsRouterInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplMentionsRouterInfo(
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