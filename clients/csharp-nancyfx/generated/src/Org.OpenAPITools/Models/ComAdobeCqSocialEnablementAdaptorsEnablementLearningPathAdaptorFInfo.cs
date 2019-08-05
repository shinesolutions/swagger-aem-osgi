using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo:  IEquatable<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo>
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
        public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo()
        {
        }

        private ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo(string Pid, string Title, string Description, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder</returns>
        public static ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder</returns>
        public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo left, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo left, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties _Properties;

            internal ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoBuilder Properties(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo</returns>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo(
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