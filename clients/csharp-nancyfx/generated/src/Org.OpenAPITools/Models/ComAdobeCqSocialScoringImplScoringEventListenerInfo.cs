using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScoringImplScoringEventListenerInfo
    /// </summary>
    public sealed class ComAdobeCqSocialScoringImplScoringEventListenerInfo:  IEquatable<ComAdobeCqSocialScoringImplScoringEventListenerInfo>
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
        public ComAdobeCqSocialScoringImplScoringEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialScoringImplScoringEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScoringImplScoringEventListenerInfo()
        {
        }

        private ComAdobeCqSocialScoringImplScoringEventListenerInfo(string Pid, string Title, string Description, ComAdobeCqSocialScoringImplScoringEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScoringImplScoringEventListenerInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder</returns>
        public static ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder Builder()
        {
            return new ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder</returns>
        public ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialScoringImplScoringEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScoringImplScoringEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScoringImplScoringEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScoringImplScoringEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScoringImplScoringEventListenerInfo left, ComAdobeCqSocialScoringImplScoringEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScoringImplScoringEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScoringImplScoringEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScoringImplScoringEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScoringImplScoringEventListenerInfo left, ComAdobeCqSocialScoringImplScoringEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScoringImplScoringEventListenerInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialScoringImplScoringEventListenerProperties _Properties;

            internal ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScoringImplScoringEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialScoringImplScoringEventListenerInfoBuilder Properties(ComAdobeCqSocialScoringImplScoringEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScoringImplScoringEventListenerInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialScoringImplScoringEventListenerInfo</returns>
            public ComAdobeCqSocialScoringImplScoringEventListenerInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialScoringImplScoringEventListenerInfo(
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