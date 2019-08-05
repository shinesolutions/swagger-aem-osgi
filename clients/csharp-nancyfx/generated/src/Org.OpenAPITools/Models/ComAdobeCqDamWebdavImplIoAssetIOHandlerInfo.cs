using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo:  IEquatable<ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo>
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
        public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo()
        {
        }

        private ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo(string Pid, string Title, string Description, ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder</returns>
        public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo left, ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo left, ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties _Properties;

            internal ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoBuilder Properties(ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo</returns>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo(
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