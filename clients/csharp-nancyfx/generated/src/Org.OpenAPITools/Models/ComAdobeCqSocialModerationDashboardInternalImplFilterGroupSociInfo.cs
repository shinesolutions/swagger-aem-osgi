using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo
    /// </summary>
    public sealed class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo:  IEquatable<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo>
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
        public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo()
        {
        }

        private ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo(string Pid, string Title, string Description, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder</returns>
        public static ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder Builder()
        {
            return new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder</returns>
        public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo left, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo left, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties _Properties;

            internal ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoBuilder Properties(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</returns>
            public ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo(
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