using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo:  IEquatable<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo>
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
        public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo()
        {
        }

        private ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo(string Pid, string Title, string Description, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder</returns>
        public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo left, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo left, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties _Properties;

            internal ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoBuilder Properties(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo</returns>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo(
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