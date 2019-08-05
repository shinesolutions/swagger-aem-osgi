using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo:  IEquatable<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo>
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
        public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo()
        {
        }

        private ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo(string Pid, string Title, string Description, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder</returns>
        public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo left, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo left, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties _Properties;

            internal ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoBuilder Properties(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo</returns>
            public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo(
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